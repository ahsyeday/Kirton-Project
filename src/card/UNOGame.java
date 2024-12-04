/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

/**
 *
 * @author SAHNAVAZ CHOKSI
 */
import java.util.ArrayList;

import java.util.Scanner;
public class UNOGame extends Game {
    private final UNODeck deck;

    public UNOGame(String name) {
        super(name);
        this.deck = new UNODeck();
    }

    public void initializePlayers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of players (2-10):");
        int numPlayers = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= numPlayers; i++) {
            System.out.println("Enter the name of player " + i + ":");
            String playerName = scanner.nextLine();
            UNOPlayer player = new UNOPlayer(playerName);
            for (int j = 0; j < 7; j++) {
                player.drawCard(deck);
            }
            getPlayers().add(player);
        }
    }

    @Override
    public void play() {
        System.out.println("Starting " + getName());
        UNOCard topCard = (UNOCard) deck.getCards().remove(0);
        System.out.println("Top card: " + topCard);

        while (true) {
            for (Player player : getPlayers()) {
                player.play(deck, topCard);
                 ((UNOPlayer) player).getHand().remove(0);
                if (((UNOPlayer) player).getHand().isEmpty()) {
                    System.out.println(player.getName() + " wins the game!");
                    return;
                }
            }
        }
    }

    @Override
    public void declareWinner() {
        System.out.println("Game Over!");
    }
}