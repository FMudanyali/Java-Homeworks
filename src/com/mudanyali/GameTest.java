package com.mudanyali;

import java.util.ArrayList;
/**
 * This class creates 10 game objects and populates
 * them in an ArrayList, then prints them out.
 * @author Furkan Mudanyali
 * @version 1.0
 * @since 2020-12-06
 */
public class GameTest {
    public static void main(String[] args) {
        // Create a new Game ArrayList and populate it with
        // the good stuff.
        ArrayList<Game> certainGames = new ArrayList<>();
        // I like Dark Souls
        certainGames.add(new Game(
            "DARK SOULS™ III",
            "RPG",
            "FROM SOFTWARE",
            2016
        ));
        certainGames.add(new Game(
            "DARK SOULS™ II: Scholar Of The First Sin",
            "RPG",
            "FROM SOFTWARE",
            2015
        ));
        certainGames.add(new Game(
            "DARK SOULS™: Prepare To Die Edition",
            "RPG",
            "FROM SOFTWARE",
            2012
        ));
        // Contrary to the reviews this is actually an epic
        // game, thank you Mr. Kojima. They also recreated
        // Fox Engine in this game using Decima Engine.
        // Has one of the best mechanics to date IMO.
        certainGames.add(new Game(
            "DEATH STRANDING",
            "Aras Kargo Simulator",
            "KOJIMA PRODUCTIONS",
            2019
        ));
        // You're that ninja...
        certainGames.add(new Game(
            "METAL GEAR SOLID",
            "Action/Adventure",
            "KONAMI",
            1998
        ));
        //This is one of the hardest shmup games.
        certainGames.add(new Game(
            "DoDonPachi DaiOuJou",
            "Shoot-Em-Up",
            "CAVE",
            2002
        ));
        // Team Shanghai Alice is actually a one-man
        // studio, ZUN makes these games.
        certainGames.add(new Game(
            "Touhou Eiyashou ~ Imperishable Night",
            "Bullet Hell",
            "Team Shanghai Alice",
            2004
        ));
        // Direct port of the arcade game, has every music
        // from the previous games. 
        certainGames.add(new Game(
            "Hatsune Miku: Project DIVA Future Tone",
            "Rhythm",
            "SEGA",
            2017
        ));
        // This game sucker punched me coming out of nowhere.
        certainGames.add(new Game(
            "Ghost of Tsushima",
            "RPG",
            "Sucker Punch Productions",
            2020
        ));
        // First ever game I played.
        certainGames.add(new Game(
            "Ratchet and Clank 3: Up Your Arsenal",
            "Action",
            "Insomniac Games",
            2004
        ));
        // Print these games out.
        System.out.println("=========================");
        for(Game object: certainGames){
            System.out.printf(
                "Title: %s%n"+
                "Genre: %s%n"+
                "Developer: %s%n"+
                "Release Date: %d%n"+
                "=========================%n",
                object.getTitle(),
                object.getGenre(),
                object.getDeveloper(),
                object.getReleaseDate()
            );
        }
    }
}
