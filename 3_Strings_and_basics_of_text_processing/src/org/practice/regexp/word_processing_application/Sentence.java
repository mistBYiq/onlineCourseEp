package org.practice.regexp.word_processing_application;

import java.util.List;

public class Sentence implements Component {

    private static Long idS = 0L;

    private final Long id;
    private List<Lexeme> listLexeme;

    public Sentence(List<Lexeme> listLexeme) {
        this.id = ++idS;
        this.listLexeme = listLexeme;
    }

    public Long getId() {
        return id;
    }

    public List<Lexeme> getListLexeme() {
        return listLexeme;
    }

    public void addLexeme(Lexeme lexeme) {
        this.listLexeme.add(lexeme);
    }

    public void addLexemesList(List<Lexeme> lexemes) {
        this.listLexeme.addAll(lexemes);
    }

    public void removeLexeme(Lexeme lexeme) {
        this.listLexeme.remove(lexeme);
    }

    @Override
    public void show() {
        System.out.print("\n(sentence id=" + getId() + ") ");
        for (Component component : listLexeme) {
            component.show();
        }
    }


}
