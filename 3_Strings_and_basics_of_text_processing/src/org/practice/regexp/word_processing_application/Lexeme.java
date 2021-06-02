package org.practice.regexp.word_processing_application;

public class Lexeme implements Component, Comparable<Lexeme> {

    private static Long idL = 0L;

    private final Long id;
    private String value;

    public Lexeme(String value) {
        this.id = ++idL;
        this.value = value;
    }

    public Long getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public void show() {
        System.out.print(getValue() + " ");
    }

    public int countCharToFind(char toFind) {
        int counter = 0;
        String val = this.value;

        for (int i = 0; i < val.length(); i++) {
            if (val.charAt(i) == toFind) {
                counter++;
            }
        }
        return counter;
    }

    @Override
    public int compareTo(Lexeme o) {
        return this.getValue().length() - o.getValue().length();
    }
}
