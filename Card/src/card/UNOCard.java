/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

/**
 *
 * @author SAHNAVAZ CHOKSI
 */
public abstract class UNOCard extends Card {
    private final Color color;
    private final int value;

    public UNOCard(Color color, int value) {
        this.color = color;
        this.value = value;
    }

    public Color getColor() {
        return color;
    }

    public int getValue() {
        return value;
    }

    @Override
    public abstract String toString();
}
