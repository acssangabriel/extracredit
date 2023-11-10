/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package q1exercise2;

/**
 *
 * @author audrey
 */
public class Exercise2 {

    public static void main(String[] args) {
        Plush alpaccaPlush = new Plush("Pacca", 50, 10.5);
        Plush penguinPlush = new Plush("Ping", 60, 6);
        Plush bearPlush = new Plush("Leo", 150, 50);
        Song song1 = new Song ("Why Worry", 80000);
        Song song2 = new Song ("About A Girl", 270000000);
        Singer singer = new Singer ("Pinguini", 23, 2600, song1);
        
        System.out.println( "Pinguini's favorite song is "
                + singer.favoriteSong.songName);
        
        singer.performForAudience(12, singer.favoriteSong);
        singer.changeFavSong(song1, song2);
        
        System.out.println( "Pinguini sang her favorite song for 12 people. "
                + "Her earnings are now Php" + singer.earnings);
        System.out.println( "Pinguini has now performed a total of " 
                + singer.noOfPerformances + " times.");
        System.out.println( "The popularity of " + song1.songName 
                + " is increased to " + song1.popularity + ".");
        System.out.println( "Pinguini's favorite song is changed to " 
                + singer.favoriteSong.songName + ".");
    }
}
