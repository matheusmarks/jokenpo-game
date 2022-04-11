package com.jokenpogame.controllers;

import com.jokenpogame.enums.PlayerChoice;
import com.jokenpogame.enums.Result;
import com.jokenpogame.entity.Player;

/**
 * @author Matheus Marques
 */

public class JokenpoRules {

    public void execute(Player playerOne, Player playerTwo) {
        PlayerChoice playerOneChoice = playerOne.getChoice();
        PlayerChoice playerTwoChoice = playerTwo.getChoice();

        printPlayerChoices(playerOne, playerTwo, playerOneChoice, playerTwoChoice);

        Result gameResult = comparePlayerChoices(playerOneChoice, playerTwoChoice);

        printResultMessage(gameResult, playerOne, playerTwo);
    }


    public Result comparePlayerChoices(PlayerChoice playerOneChoice, PlayerChoice playerTwoChoice) {
        if(playerOneChoice.equals(playerTwoChoice)) {
           return Result.TIE;
        }

        switch(playerOneChoice) {
            case ROCK:
                return (playerTwoChoice.equals(PlayerChoice.SCISSORS) ? Result.WIN : Result.LOSE);
            case PAPER:
                return (playerTwoChoice.equals(PlayerChoice.ROCK) ? Result.WIN : Result.LOSE);
            case SCISSORS:
                return (playerTwoChoice.equals(PlayerChoice.PAPER) ? Result.WIN : Result.LOSE);
        }
        return null;
    }

    public void printResultMessage(Result gameResult, Player playerOne, Player playerTwo) {

        switch(gameResult) {
            case WIN:
                System.out.println(playerOne + " venceu o jogo !");
                break;
            case LOSE:
                System.out.println(playerTwo + " venceu o jogo !");
                break;
            case TIE:
                System.out.println(playerOne + " e " + playerTwo + " escolheram a mesma opção, portanto houve empate !");
                break;
        }
    }

    public void printPlayerChoices(Player playerOne, Player playerTwo, PlayerChoice playerOneChoice,
                                          PlayerChoice playerTwoChoice) {
        System.out.println(playerOne + " escolheu " + playerOneChoice.getDescription().toUpperCase()
                + " e " + playerTwo + " escolheu " + playerTwoChoice.getDescription().toUpperCase());
    }

}
