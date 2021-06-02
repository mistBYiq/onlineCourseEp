package org.practice.regexp.word_processing_application;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test {
    // TODO: 002 02.06.21 source text

    private static final String SOURCE_TEXT = "3_Strings_and_basics_of_text_processing/res/cat.txt";

    public static void main(String[] args) throws IOException {
        String text = "\t A ( Campaign for Real 15423 ) Cats.\n" +
                "\n" +
                "\tFar * too many people these days 152,1 have grown used to boring, mass-produced cats, which may bounce with health and nourishing vitamins but aren't a patch on the good old cats you used to get. The Campaign for Real Cats wants to change all hat by helping people recognise Real Cats when they see them. Hence this book.\n" +
                "\n" +
                "\tThe Campaign for Real Cats is against fizzy keg cats.\n" +
                "\n" +
                "\tAll right, How can I recognise a Real cat ?\n" +
                "\n" +
                "\tSimple. Nature has done ( a lot of the work for you ) . Many Real cats are instantly recognisable. For example, all cats with faces that look as though they had been put in a vice and hit repeatedly by a hammer with a sock round it are Real cats. Cats with ears that look as though they have been trimmed with pinking shears are Real cats. Almost every non-pedigree unneutered tom is not only Real, but as it hangs around the house it gets Realer and Realer until one of you is left in absolutely no doubt as to its Realness.\n" +
                "\n" +
                "\tFluffy cats are not necessarily unReal, but if they persist in putting on expressions of affronted dignity for the camera while advertising anything with the word “purr-fect” in the associated copy they are definitely bringing their Realness into question.\n" +
                "\n" +
                "\tAh. So cats in adverts aren't Real ?\n" +
                "\n" +
                "\tActually being in adverts 75245 doesn't make a cat unReal—it can't help it if someone plonks it down in some weird pyramid made of carpet and takes pictures of it peeping anxiously out of the hole—but its demeanour once there counts for a lot.\n" +
                "\n" +
                "\tFor * example, if you put an unReal cat down in front of a row of bowls of catfood it will obediently choose the one made by the sponsors of the ad even if all the others haven't got sump oil on them. A Real cat, on the other hand, will head for the most expensive regardless, pull it out onto the studio floor, eat it with great pleasure, try some of the others, trip up the cameraman and then get stuck behind the newsreaders' podium. Where it will be sick. And then, when its owners buy several large tins of the wretched stuff, it'll refuse to touch it again.\n" +
                "\n" +
                "\tReal cats never 2,4 wear bows (but sometimes they do wear bow-ties; see “Cartoon Cats”).";

        String string = "aeraavoe";
        String string1 = "bredlozheniea";
        String string2 = "cavtoroe";
        String string3 = "daraert'e";
        String string4 = "dbetvertaaoe";
        String string5 = "cbyatoe";

        Lexeme l = new Lexeme(string);
        Lexeme l1 = new Lexeme(string1);
        Lexeme l2 = new Lexeme(string2);
        Lexeme l3 = new Lexeme(string3);
        Lexeme l4 = new Lexeme(string4);
        Lexeme l5 = new Lexeme(string5);

        List<Lexeme> lexemeList = new ArrayList<>();
        lexemeList.add(l);
        lexemeList.add(l1);
        lexemeList.add(l2);
        lexemeList.add(l3);
        lexemeList.add(l4);
        lexemeList.add(l5);


//        String text1 = UtilText.readUsingApacheCommonsIO(SOURCE_TEXT);
//       System.out.println(text1);
//
        System.out.println(text);
        CustomText customText;
        customText = UtilText.parseText(text);
        customText.show();

        System.out.println("\nSorted ");
        CustomText sortedText = UtilText.sortByParagraphs(customText);
        sortedText.show();

        System.out.println("\nSorted Lexeme in Sentence");
        CustomText sortedText1 = UtilText.sortLexemeByLength(sortedText);
        sortedText1.show();

        final char toFind = 'a';
        Sentence sentence = new Sentence(lexemeList);

        UtilText.sortSentenceByToFindChar(toFind, sentence);

    }
}
