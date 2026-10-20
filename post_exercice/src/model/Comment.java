package model;

public class Comment {
    private String text;

    @Override
    public String toString() {
        return text;
    }

    public Comment(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
