package com.jvmcosta.exercicios.posts.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Post {
    private LocalDate moment;
    private String title;
    private String content;
    private int likes;

    private List<Comment> comments = new ArrayList<>();

    public Post() {
    }

    public Post(LocalDate moment, String title, String content, int likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public LocalDate getMoment() {
        return moment;
    }

    public void setMoment(LocalDate moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Comment> getComments(){
        return comments;
    }

    public void addComment(Comment text){
        comments.add(text);
    }

    public Integer getLikes(){
        return likes;
    }

    public void addLikes(){
        this.likes+=1;
    }

    

}
