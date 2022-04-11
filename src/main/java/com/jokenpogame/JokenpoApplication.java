package com.jokenpogame;

import com.jokenpogame.controllers.JokenpoRules;
import com.jokenpogame.enums.PlayerChoice;
import com.jokenpogame.entity.Player;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JokenpoApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("-------- Bem-vindo ao jogo Jokenpo ----------");
            System.out.println("Digite o nome do jogador 1: ");
            String playerOneName = sc.next();

            System.out.println("Digite o nome do jogador 2: ");
            String playerTwoName = sc.next();

            System.out.println(playerOneName + " digite Pedra, Papel ou Tesoura para realizar sua escolha: ");
            String playerOneChoice = sc.next();

            System.out.println(playerTwoName + " digite Pedra, Papel ou Tesoura para realizar sua escolha: ");
            String playerTwoChoice = sc.next();

            Player player1 = new Player(playerOneName, PlayerChoice.getInstance(playerOneChoice));
            Player player2 = new Player(playerTwoName, PlayerChoice.getInstance(playerTwoChoice));

            JokenpoRules r = new JokenpoRules();
            r.execute(player1, player2);

        }catch (Exception e) {
            throw new InputMismatchException("\n Os valores de suas escolhas não foram inseridos corretamente." +
                    "\n Digite Pedra, Papel ou Tesoura (exatamente assim)");
        }
    }
}
