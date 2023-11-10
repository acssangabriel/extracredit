/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q1exercise2;

/**
 *
 * @author audrey
 */
public class Singer {
    String name;
    int noOfPerformances;
    double earnings;
    Song favoriteSong;
    
    public Singer(String n, int p, double e, Song s){
        name = n;
        noOfPerformances = p;
        earnings = e;
        favoriteSong = s;
    }
    
    public void performForAudience(int noOfPeople, Song s){
        noOfPerformances += 1 ;
        earnings += noOfPeople * 100;
        s.sung(noOfPeople);
    }
    
    public void changeFavSong(Song s1, Song s2){
        if(favoriteSong == s1) {
            favoriteSong = s2;
        }
        else { favoriteSong = s1; }
    }
}
