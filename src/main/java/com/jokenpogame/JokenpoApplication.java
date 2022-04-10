package com.jokenpogame;

import com.jokenpogame.controllers.JokenpoRules;
import com.jokenpogame.enums.PlayerChoice;
import com.jokenpogame.entity.Player;

public class JokenpoApplication {

    public static void main(String[] args) {
        Player player1 = new Player("Matheus", PlayerChoice.SCISSORS);
        Player player2 = new Player("Clara", PlayerChoice.ROCK);

        JokenpoRules r = new JokenpoRules();
        r.execute(player1, player2);
    }
}
