package com.lewickiy.criteria_api_exercise.entity;

public enum Profession {
    ACTOR ("actor"),
    PRODUCER("producer"),
    DIRECTOR("director");

    private final String title;

    Profession(String title) {
        this.title = title;
    }

    String getTitle() {
        return title;
    }
}
