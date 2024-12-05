/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

/**
 *
 * @author SAHNAVAZ CHOKSI
 */
public class Main {
   public static void main(String[] args) {
        UNOGame game = new UNOGame("UNO") {};
        game.initializePlayers(); 
        game.play(); 
    }
}
