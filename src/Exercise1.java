/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author audrey
 */
public class Exercise1 {
    public static void main(String[] args) {
        String plush1Name = "Pacca";
        int plush1Size = 50;
        double plush1Age = 10.5;
        
        String plush2Name = "Ping";
        int plush2Size = 60;
        double plush2Age = 6;
        
        String plush3Name = "Pinguini";
        int plush3Size = 30;
        double plush3Age = 0.3;
        
        double ageTotal = plush1Age + plush2Age + plush3Age;
        boolean plush2IsBiggest =  plush2Size > plush1Size &&
                plush2Size > plush3Size;
        boolean plush2IsEldest =  plush2Age > plush1Age && 
                plush2Age > plush3Age;
        
        
        System.out.println("Plushie 1");
        System.out.println("Name: " + plush1Name);
        System.out.println("Size in cm: " + plush1Size);
        System.out.println("Age in months: " + plush1Age + "\n");
        
        System.out.println("Plushie 2");
        System.out.println("Name: " + plush2Name);
        System.out.println("Size in cm: " + plush2Size);
        System.out.println("Age in months: " + plush2Age + "\n");
        
        System.out.println("Plushie 3");
        System.out.println("Name: " + plush3Name);
        System.out.println("Size in cm: " + plush3Size);
        System.out.println("Age in months: " + plush3Age + "\n");
        
        System.out.println("Total plushie age: " + ageTotal);
        System.out.println("Ping is the largest: " + plush2IsBiggest);
        System.out.println("Ping is the eldest: " + plush2IsEldest);
    }
}
