/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package q1exercise3;

/**
 *
 * @author audrey
 */
public class Exercise3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Plush alpaccaPlush = new Plush("Pacca", 50, 10.5);
        Plush penguinPlush = new Plush("Ping", 60, 6);
        Plush bearPlush = new Plush("Leo", 150, 50);
        Song song1 = new Song ("Why Worry", 80000);
        Song song2 = new Song ("About A Girl", 270000000);
        Singer singer1 = new Singer ("Pinguini", 23, 2600, song1);
        Singer singer2 = new Singer ("Katarina", 11, 1200, song2);
        
        singer1.performForAudience(20, singer1, singer2);
        
        System.out.println(singer1.getName() + " and " + singer2.getName()
                + " performed for 20 people. ");
        System.out.println("Total performances of the singers is now " 
                + singer1.getTotalPerformances() + ".");
    }
    
}
