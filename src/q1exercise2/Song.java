/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q1exercise2;

/**
 *
 * @author audrey
 */
public class Song {
    String songName;
    int popularity;
    
    public Song(String n, int p) {
        songName = n;
        popularity = p;
    }
    
    public void sung(int noOfListeners) {
        popularity += noOfListeners;
    }
}
