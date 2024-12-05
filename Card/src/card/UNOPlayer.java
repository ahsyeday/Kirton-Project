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

public class UNOPlayer extends Player {
    private final ArrayList<UNOCard> hand;
    private UNOCard lastPlayedCard;

    public UNOPlayer(String name) {
        super(name);
        this.hand = new ArrayList<>();
    }

    public ArrayList<UNOCard> getHand() {
        return hand;
    }

    public UNOCard getLastPlayedCard() {
        return lastPlayedCard;
    }

    public void drawCard(UNODeck deck) {
        if (!deck.getCards().isEmpty()) {
            hand.add((UNOCard) deck.getCards().remove(0));
        }
    }

    @Override
    public void play(UNODeck deck, UNOCard topCard) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(getName() + "'s turn. Top card to match: " + topCard);
        System.out.println(getName() + "'s hand " + hand);

        boolean cardPlayed = false;
        while (!cardPlayed) {
            System.out.println("Enter the index of the card to play (0 to " + (hand.size() - 1) + ") or -1 to draw a card:");
            int choice = scanner.nextInt();

            if (choice >= 0 && choice < hand.size()) {
                UNOCard selectedCard = hand.get(choice);

                if (selectedCard.getColor().equals(topCard.getColor()) ||
                    selectedCard.getValue() == topCard.getValue()) {
                    hand.remove(choice);
                    lastPlayedCard = selectedCard;
                    System.out.println(getName() + " played: " + selectedCard);
                    cardPlayed = true;
                } else {
                    System.out.println("Invalid card. Please choose a card matching the color or value.");
                }
            } else if (choice == -1) {
                System.out.println(getName() + " draws a card.");
                drawCard(deck);
                cardPlayed = true;
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }
        System.out.println(getName() + "'s hand after turn: " + hand);
    }
}
