package org.practice.regexp.word_processing_application;

import java.util.List;

public class Paragraph implements Component, Comparable<Paragraph> {

    private static Long idP = 0L;

    private final Long id;
    private List<Sentence> sentenceList;

    public Paragraph(List<Sentence> sentenceList) {
        this.id = ++idP;
        this.sentenceList = sentenceList;
    }

    public Long getId() {
        return id;
    }

    public List<Sentence> getSentenceList() {
        return sentenceList;
    }

    public void addSentence(Sentence sentence) {
        this.sentenceList.add(sentence);
    }

    public void addSentences(List<Sentence> sentences) {
        this.sentenceList.addAll(sentences);
    }

    public void removeSentence(Sentence sentence) {
        this.sentenceList.remove(sentence);
    }

    @Override
    public void show() {
        System.out.print("\n[paragraph id = " + getId() + "] ");
        for (Component component : sentenceList) {
            component.show();
        }
    }

    @Override
    public int compareTo(Paragraph o) {
        return this.getSentenceList().size() - o.getSentenceList().size();
    }
}
