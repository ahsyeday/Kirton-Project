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

/**
 *
 * @author SAHNAVAZ CHOKSI
 */
public abstract class Game {
    private final String name; // the title of the game
    ArrayList<Player> players = new ArrayList<>(); // initialize players list

    public Game(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public abstract void play();
    public abstract void declareWinner();
}