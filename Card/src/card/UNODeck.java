/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

/**
 *
 * @author SAHNAVAZ CHOKSI
 */
public class UNODeck extends GroupOfCards {

    public UNODeck() {
        super(108);
        createDeck();
        shuffle();
    }

    private void createDeck() {
        for (Color color : Color.values()) {
            if (color == Color.WILD) continue;

            for (int i = 0; i <= 9; i++) {
                getCards().add(new NumberCard(color, i));
                if (i != 0) getCards().add(new NumberCard(color, i));
            }

            getCards().add(new SpecialCard(color, SpecialType.SKIP));
            getCards().add(new SpecialCard(color, SpecialType.SKIP));
            getCards().add(new SpecialCard(color, SpecialType.REVERSE));
            getCards().add(new SpecialCard(color, SpecialType.REVERSE));
            getCards().add(new SpecialCard(color, SpecialType.DRAW_TWO));
            getCards().add(new SpecialCard(color, SpecialType.DRAW_TWO));
        }

        for (int i = 0; i < 4; i++) {
            getCards().add(new SpecialCard(Color.WILD, SpecialType.WILD));
            getCards().add(new SpecialCard(Color.WILD, SpecialType.WILD_DRAW_FOUR));
        }
    }
}
