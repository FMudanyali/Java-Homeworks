package com.mudanyali;
/**
 * A class that holds information about games, to be used
 * with GameTest.
 * @author Furkan Mudanyali
 * @version 1.0
 * @since 2020-12-06
 */
public class Game {
    public String title;
    public String genre;
    public String developer;
    public int releaseDate;

    //Our set-get methods
    public void setTitle(String title){
        this.title = title;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }
    public void setDeveloper(String developer){
        this.developer = developer;
    }
    public void setReleaseDate(int releaseDate){
        this.releaseDate = releaseDate;
    }

    public String getTitle(){
        return this.title;
    }
    public String getGenre(){
        return this.genre;
    }
    public String getDeveloper(){
        return this.developer;
    }
    public int getReleaseDate(){
        return this.releaseDate;
    }

    //Our constructors
    public Game(String title, String genre, String developer, int releaseDate){
        setTitle(title);
        setGenre(genre);
        setDeveloper(developer);
        setReleaseDate(releaseDate);
    }
    public Game(){
        setTitle("Unknown");
        setGenre("Unknown");
        setDeveloper("Unknown");
        setReleaseDate(1970);
    }
}
