package view;

import model.Comment;
import model.Post;

import java.time.LocalDateTime;
import java.util.Formatter;
import java.time.format.DateTimeFormatter;

public class Main {
    //Testar passando localdatetimeof dentro do construtor.
    static void main(String[] args) {
        Post travelingPost = new Post("Traveling to New Zealand",
                "I'm going to visit this wonderful country!",
                 LocalDateTime.of(2018,06,21,13,05,44));
        Comment momComment = new Comment("Have a nicre trip");
        Comment friendComment = new Comment("Wow that's awesome!");

        //  28/07/2018 23:14:19
        LocalDateTime date2 = LocalDateTime.of(2018, 07, 28, 23, 14, 19);
        Post goodNightPost = new Post("Good night guys", "See you tomorow", date2);
        Comment normalComment = new Comment("Good night");
        Comment nerdComment = new Comment("May the Force be with you");


        //curtidas
        for (int i = 1; i <= 12; i++) {
            travelingPost.addLikes();
        }
        travelingPost.addComment(momComment);
        travelingPost.addComment(friendComment);
        travelingPost.showPost();
        System.out.println();


        for (int i = 1; i <= 5; i++) {
            goodNightPost.addLikes();
        }
        goodNightPost.addComment(normalComment);
        goodNightPost.addComment(nerdComment);
        goodNightPost.showPost();



    }//
}