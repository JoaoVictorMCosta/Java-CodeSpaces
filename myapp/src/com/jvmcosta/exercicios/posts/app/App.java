package com.jvmcosta.exercicios.posts.app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.jvmcosta.exercicios.posts.entities.Comment;
import com.jvmcosta.exercicios.posts.entities.Post;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        Post post = new Post(LocalDate.parse("21/06/2018 13:05:44",dtf), "Traveling to New Zealand", "I'm going to visit this wonderful country", 12);
        
        Post post2 = new Post(LocalDate.parse("28/07/2018 23:14:19",dtf), "Good night guys", "See you tomorrow", 5);
        
        post.addComment(new Comment("Have a nice trip"));
        post.addComment(new Comment("Wow that's awesome!"));
        
        post2.addComment(new Comment("Good night"));
        post2.addComment(new Comment("May the Force be with you"));

        System.out.println(post.toString());
        System.out.println(post2.toString());

        sc.close();
    }
}
