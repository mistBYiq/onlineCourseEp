package org.practice.regexp.word_processing_application;

import java.util.List;

public class CustomText implements Component {

    private static Long idT = 0L;

    private final Long id;
    private List<Paragraph> paragraphList;

    public CustomText(List<Paragraph> paragraphList) {
        this.id = ++idT;
        this.paragraphList = paragraphList;
    }

    public Long getId() {
        return id;
    }

    public List<Paragraph> getParagraphList() {
        return paragraphList;
    }

    public void addParagraphs(List<Paragraph> paragraphs) {
        this.paragraphList.addAll(paragraphs);
    }

    public void removeParagraph(Paragraph paragraph) {
        this.paragraphList.remove(paragraph);
    }

    @Override
    public void show() {
        for (Component component : paragraphList) {
            component.show();
            System.out.println();
        }
    }
}
