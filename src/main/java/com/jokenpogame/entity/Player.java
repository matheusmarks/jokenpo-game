package com.jokenpogame.entity;

import com.jokenpogame.enums.PlayerChoice;

import java.io.Serializable;

public class Player implements Serializable {

    private String playerName;
    private PlayerChoice choice;

    public Player(String playerName, PlayerChoice option) {
        this.playerName = playerName;
        this.choice = option;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public PlayerChoice getChoice() {
        return choice;
    }

    public void setChoice(PlayerChoice choice) {
        this.choice = choice;
    }

    @Override
    public String toString() {
        return playerName;
    }
}
