package com.example.FacebookClone.model;

public class Post {
    private int id;
    private String title;
    private String body;
    private String imageName;
    private String name;
    private String numEmail;
    private int noLikes;
    private int noComments;
    private boolean likedPost;

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", imageName='" + imageName + '\'' +
                ", name='" + name + '\'' +
                ", noLikes=" + noLikes +
                ", noComments=" + noComments +
                ", likedPost=" + likedPost +
                '}';
    }

    public void setNoLikes(int noLikes) {
        this.noLikes = noLikes;
    }

    public void setNoComments(int noComments) {
        this.noComments = noComments;
    }

    public void setLikedPost(boolean likedPost) {
        this.likedPost = likedPost;
    }

    public int getNoLikes() {
        return noLikes;
    }

    public int getNoComments() {
        return noComments;
    }

    public boolean isLikedPost() {
        return likedPost;
    }

    public String getName() {
        return name;
    }


    public Post(String title, String body, String imageName) {
        this.title = title;
        this.body = body;
        this.imageName = imageName;
    }

    public String getNumEmail() {
        return numEmail;
    }

    public void setNumEmail(String numEmail) {
        this.numEmail = numEmail;
    }


    public Post(){}

    public Post(String title, String body) {
        this.title = title;
        this.body = body;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public void setName(String surname) {
        this.name = surname ;
    }
}
