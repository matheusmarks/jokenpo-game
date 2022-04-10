package com.jokenpogame.enums;

public enum PlayerChoice {

    ROCK(1, "Pedra"),
    PAPER(2, "Papel"),
    SCISSORS(3, "Tesoura");

    PlayerChoice(Integer id, String description) {
        this.id = id;
        this.description = description;
    }

    public static PlayerChoice getInstance(String description) {
        for(PlayerChoice option : PlayerChoice.values()) {
            if(option.description.equals(description)) {
                return option;
            }
        }
        return null;
    }

    private final Integer id;
    private final String description;

    public Integer getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

}
