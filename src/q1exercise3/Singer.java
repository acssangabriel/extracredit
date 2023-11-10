/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q1exercise3;

/**
 *
 * @author audrey
 */
public class Singer {
    private String name;
    private int noOfPerformances;
    private double earnings;
    private Song favoriteSong;
    private static int totalPerformances = 0;
    
    public Singer(String n, int p, double e, Song s){
        name = n;
        noOfPerformances = p;
        earnings = e;
        favoriteSong = s;
        totalPerformances += p;
    }
    
    public void performForAudience(int noOfPeople, Song s){
        noOfPerformances += 1 ;
        earnings += noOfPeople * 100;
        s.sung(noOfPeople);
        totalPerformances++;
    }
    
    public void performForAudience(int noOfPeople, Singer s1, Singer s2){
        s1.noOfPerformances += 1 ;
        s2.noOfPerformances += 1 ;
        s1.earnings += noOfPeople * 50;
        s2.earnings += noOfPeople * 50;
        totalPerformances += 2;
    }
    
    public void changeFavSong(Song s1, Song s2){
        if(favoriteSong == s1) {
            favoriteSong = s2;
        }
        else { favoriteSong = s1; }
    }
    
    public String getName() {
        return name;
    }
    
    public int getNoOfPerformances() {
        return noOfPerformances;
    }
    
    public double getEarnings() {
        return earnings;
    }
    
    public Song getFavSong() {
        return favoriteSong;
    }
    
    public int getTotalPerformances() {
        return totalPerformances;
    }
}
