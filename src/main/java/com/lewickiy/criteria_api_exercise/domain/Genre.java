package com.lewickiy.criteria_api_exercise.domain;

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
    public static final String NAME = Profession.class.getSimpleName().toLowerCase();

    Genre(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
