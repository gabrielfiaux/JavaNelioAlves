package model;

import java.text.Format;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Post {
    private LocalDateTime moment;
    private String title;
    private String content;
    private Integer likes = 0;

    private List<Comment> comments = new ArrayList<>();

    public Post() {
    }

    public Post(String title, String content) {

        this.moment = moment.now();
        this.title = title;
        this.content = content;


    }

    public Post(String title, String content, LocalDateTime date) {

        this.moment = date;
        this.title = title;
        this.content = content;


    }

    public Post(LocalDateTime moment, String title, String content, Integer likes, List<Comment> comments) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Post{" +
                "moment=" + moment +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", likes=" + likes +
                ", comments=" + comments +
                '}';
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public Integer getLikes() {
        return likes;
    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    //adiciona comentario ao post
    public void addComment(Comment comment) {
        comments.add(comment);

    }

    public void addLikes() {
        likes += 1;
    }

    public String getFormattedDate1() {
        return this.moment.format(DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm:ss"));
    }

    public void showPost() {
        System.out.println(this.title);
        System.out.printf("%d Likes", this.likes);
        System.out.println(" - " + getFormattedDate1());
        System.out.println(content);
        System.out.println("Comments:");
        for (Comment comment : this.comments) {
            System.out.print(comment);
            System.out.println();
        }
    }

}
