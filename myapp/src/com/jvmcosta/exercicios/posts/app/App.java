package com.jvmcosta.exercicios.posts.app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.jvmcosta.exercicios.posts.entities.Post;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Post post = new Post(LocalDate.parse("21/06/2018",dtf), "Traveling to New Zealand", "i'm going to visit this wonderful country", 12);

        

        sc.close();
    }
}
