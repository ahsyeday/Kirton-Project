/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

/**
 *
 * @author SAHNAVAZ CHOKSI
 */
public class SpecialCard extends UNOCard {
    private final SpecialType effect;

    public SpecialCard(Color color, SpecialType effect) {
        super(color, -1);
        this.effect = effect;
    }

    public SpecialType getEffect() {
        return effect;
    }

    @Override
    public String toString() {
        return getColor() + " " + effect;
    }
}