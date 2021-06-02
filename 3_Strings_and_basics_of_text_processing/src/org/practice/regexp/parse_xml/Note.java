package org.practice.regexp.parse_xml;

public class Note {

    private String to;
    private String from;
    private String heading;
    private String body;


    public Note(String to, String from, String heading, String body) {
        this.to = to;
        this.from = from;
        this.heading = heading;
        this.body = body;
    }

    public String getTo() {
        return to;
    }

    public String getFrom() {
        return from;
    }

    public String getHeading() {
        return heading;
    }

    public String getBody() {
        return body;
    }
}
