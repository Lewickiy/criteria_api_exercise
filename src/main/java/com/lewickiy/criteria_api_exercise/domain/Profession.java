package com.lewickiy.criteria_api_exercise.domain;

import lombok.Getter;

@Getter
public enum Profession {
    ACTOR ("актёр"),
    PRODUCER("продюсер"),
    DIRECTOR("режиссёр");

    private final String title;
    public static final String NAME = Profession.class.getSimpleName().toLowerCase();

    Profession(String title) {
        this.title = title;
    }

    public String getName() {
        return name();
    }
}
