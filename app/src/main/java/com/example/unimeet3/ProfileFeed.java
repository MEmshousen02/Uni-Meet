package com.example.unimeet3;

public class ProfileFeed {
    private String age, bio, email, major, password, pic;

    private String[] classes = new String[6];
    private String[] hobbies = new String[6];
    private String[] orgs = new String[3];

    public ProfileFeed() {

    }
    public ProfileFeed(String age, String bio, String email, String major, String password, String pic, String[] classes, String[] hobbies, String[] orgs) {
        this.age = age;
        this.bio = bio;
        this.email = email;
        this.major = major;
        this.password = password;
        this.pic = pic;
        this.classes = classes;
        this.hobbies = hobbies;
        this.orgs = orgs;
    }
}
