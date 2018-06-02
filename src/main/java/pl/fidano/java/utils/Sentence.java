package pl.fidano.java.utils;

public class Sentence {

    private String sentence;
    private String author;

    public Sentence(String sentence, String author) {
        this.sentence = sentence;
        this.author = author;
    }

    public String getSentence() {
        return sentence;
    }

    public String getAuthor() {
        return author;
    }
}
