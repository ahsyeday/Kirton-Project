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
        for (int i = 0; i < hand.size(); i++) {
            UNOCard card = hand.get(i);
           if (card.getColor().equals(topCard.getColor()) ||    
                card.getValue() == topCard.getValue() ||         
                card instanceof SpecialCard &&                    
                (
                    ((SpecialCard) card).getEffect() == SpecialType.SKIP ||
                    ((SpecialCard) card).getEffect() == SpecialType.REVERSE || 
                    ((SpecialCard) card).getEffect() == SpecialType.WILD || 
                    ((SpecialCard) card).getEffect() == SpecialType.WILD_DRAW_FOUR
                )) {
                
                System.out.println("Enter " + i + " to play " + card + " or -1 to draw a card.");
                int choice = scanner.nextInt();
                if (choice == i) {
                    hand.remove(card);
                    lastPlayedCard = card;
                    System.out.println(getName() + " played: " + card);
                    cardPlayed = true;
                    break;
                }
            }
        }

        if (!cardPlayed) {
            System.out.println(getName() + " draws a card.");
            drawCard(deck);
        }
        System.out.println(getName() + "'s hand after turn: " + hand);
    }
}

