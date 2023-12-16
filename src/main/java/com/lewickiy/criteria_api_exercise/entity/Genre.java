package com.lewickiy.criteria_api_exercise.entity;

public enum Genre {
    ACTION ("action"),
    COMEDY ("comedy"),
    DRAMA ("drama"),
    CRIME ("crime"),
    FANTAZY ("fantasy"),
    THRILLER ("thriller"),
    HORROR ("horror"),
    ANIMATION ("animation");

    private final String title;

    Genre(String title) {
        this.title = title;
    }

    String getTitle() {
        return title;
    }
}
