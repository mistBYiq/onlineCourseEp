package org.practice.regexp.word_processing_application;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UtilText {
    private static final String REGEXP_PARAGRAPH = "((?:[^\\n][\\n]?)+)";
    private static final String REGEXP_SENTENCE = "([^.!?]+[.!?])";
    private static final String REGEXP_LEXEME = "([^ ]+)";

    public static CustomText parseText(String text) {
        List<Paragraph> paragraphList = splitTextIntoParagraphs(text);

        return new CustomText(paragraphList);
    }

    private static List<Paragraph> splitTextIntoParagraphs(String text) {
        List<Paragraph> paragraphList = new ArrayList<>();
        Pattern patternWord =
                Pattern.compile(REGEXP_PARAGRAPH, Pattern.MULTILINE);
        Matcher matcherWord = patternWord.matcher(text);

        while (matcherWord.find()) {
            for (int i = 0; i < matcherWord.groupCount(); i++) {
                List<Sentence> sentenceList = splitParagraphIntoSentences(matcherWord.group(i));
                Paragraph paragraph = new Paragraph(sentenceList);
                paragraphList.add(paragraph);
            }
        }
        return paragraphList;
    }

    private static List<Sentence> splitParagraphIntoSentences(String paragraph) {
        List<Sentence> sentenceList = new ArrayList<>();
        Pattern patternWord = Pattern.compile(REGEXP_SENTENCE, Pattern.MULTILINE);
        Matcher matcherWord = patternWord.matcher(paragraph);

        while (matcherWord.find()) {
            for (int i = 0; i < matcherWord.groupCount(); i++) {
                List<Lexeme> lexemeList = splitSentenceIntoWord(matcherWord.group(i));
                Sentence sentences = new Sentence(lexemeList);
                sentenceList.add(sentences);
            }
        }
        return sentenceList;
    }

    private static List<Lexeme> splitSentenceIntoWord(String sentence) {
        List<Lexeme> lexemeList = new ArrayList<>();
        Pattern patternWord = Pattern.compile(REGEXP_LEXEME, Pattern.MULTILINE);
        Matcher matcherWord = patternWord.matcher(sentence);

        while (matcherWord.find()) {
            for (int i = 0; i < matcherWord.groupCount(); i++) {
                lexemeList.add(new Lexeme(matcherWord.group(i)));
            }
        }
        return lexemeList;
    }

    public static CustomText sortByParagraphs(CustomText text) {
        List<Paragraph> paragraphList = text.getParagraphList();
        paragraphList.sort(Paragraph::compareTo);

        return new CustomText(paragraphList);
    }

    public static CustomText sortLexemeByLength(CustomText text) {
        List<Paragraph> paragraphList = text.getParagraphList();

        for (Paragraph paragraph : paragraphList) {
            sortLexemeInSentence(paragraph);
        }

        return new CustomText(paragraphList);
    }

    private static Paragraph sortLexemeInSentence(Paragraph paragraph) {
        List<Sentence> sentenceList = paragraph.getSentenceList();

        for (Sentence sentence : sentenceList) {
            sentence.getListLexeme().sort(Lexeme::compareTo);
        }

        return new Paragraph(sentenceList);
    }

    public static void sortSentenceByToFindChar(char toFind, Sentence sentence) {
        Map<String, Integer> map = new TreeMap<>();

        for (Lexeme lexeme : sentence.getListLexeme()) {
            map.put(lexeme.getValue(), lexeme.countCharToFind(toFind));
        }

        map.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }

    public static String readFile(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }

    public static String readUsingApacheCommonsIO(String fileName) throws IOException {
        return FileUtils.readFileToString(new File(fileName), StandardCharsets.UTF_8);
    }
}
