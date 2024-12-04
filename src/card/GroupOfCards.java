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
import java.util.Collections;

/**
 *
 * @author SAHNAVAZ CHOKSI
 */
public class GroupOfCards {
    private final ArrayList<Card> cards; // the group of cards
    private int size; // the size of the grouping

    public GroupOfCards(int size) {
        this.size = size;
        cards = new ArrayList<>(size); // initialize with specified size
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}