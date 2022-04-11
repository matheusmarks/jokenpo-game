package com.jokenpogame.controllers;

import com.jokenpogame.enums.PlayerChoice;
import com.jokenpogame.enums.Result;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JokenpoRulesTest {

    private static JokenpoRules jokenpoRules;
    private PlayerChoice playerOneChoice;
    private PlayerChoice playerTwoChoice;
    private Result expectedGameResult;


    @BeforeAll
    static void setUpObjects() {
        jokenpoRules = new JokenpoRules();
    }

    @Test
    @DisplayName("Deve retornar TIE (empate), quando ambos os jogadores escolhem a mesma opção")
    void itShouldReturnTieForIdenticalPlayerChoices() {
        playerOneChoice = PlayerChoice.PAPER;
        playerTwoChoice = PlayerChoice.PAPER;

        expectedGameResult = jokenpoRules.comparePlayerChoices(playerOneChoice, playerTwoChoice);

        assertEquals(Result.TIE, expectedGameResult);
    }

    @Test
    @DisplayName("Deve retornar WIN (vitória), quando pedra vence a tesoura")
    void itShouldReturnWinWhenRockBeatsScissors() {
        playerOneChoice = PlayerChoice.ROCK;
        playerTwoChoice = PlayerChoice.SCISSORS;

        expectedGameResult = jokenpoRules.comparePlayerChoices(playerOneChoice, playerTwoChoice);

        assertEquals(Result.WIN, expectedGameResult);
    }

    @Test
    @DisplayName("Deve retornar WIN (vitória), quando papel vence a pedra")
    void itShouldReturnWinWhenPaperBeatsRock() {
        playerOneChoice = PlayerChoice.PAPER;
        playerTwoChoice = PlayerChoice.ROCK;

        expectedGameResult = jokenpoRules.comparePlayerChoices(playerOneChoice, playerTwoChoice);

        assertEquals(Result.WIN, expectedGameResult);
    }

    @Test
    @DisplayName("Deve retornar WIN (vitória), quando tesoura vence o papel")
    void itShouldReturnWinWhenScissorsBeatsPaper() {
        playerOneChoice = PlayerChoice.SCISSORS;
        playerTwoChoice = PlayerChoice.PAPER;

        expectedGameResult = jokenpoRules.comparePlayerChoices(playerOneChoice, playerTwoChoice);

        assertEquals(Result.WIN, expectedGameResult);
    }
}