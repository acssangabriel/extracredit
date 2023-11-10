/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex04_muo_sangabrielas;

/**
 *
 * @author audrey
 */
import java.util.Scanner;

public class EX04_MUO_SanGabrielAS {

    public static void main(String[] args) {

	Move rock = new Move("Rock");
	Move paper = new Move("Paper");
	Move scissors = new Move("Scissors");
		
	rock.setStrongAgainst(scissors);
	paper.setStrongAgainst(rock);
	scissors.setStrongAgainst(paper);
		
        Scanner sc = new Scanner(System.in);
	int roundsToWin = 2;
        int playerChoice;
        int playerMoveChoice;
        Move playerMove;
        Move computerMove;
        int playerWins = 0;
        int computerWins = 0;
        
	do {
            System.out.print("Welcome to Rock, Paper, Scissors. Please");
            System.out.println(" choose an option:");
            System.out.println("1. Start game");
            System.out.println("2. Change number of rounds");
            System.out.println("3. Exit application");
            System.out.print("> ");
            playerChoice = sc.nextInt();
            System.out.print("\n");
            
            if(playerChoice == 1) {
                System.out.println("This match will be first to " + roundsToWin
                        + " wins.");
                while (playerWins < roundsToWin && computerWins < roundsToWin){
                    System.out.print("The computer has selected its move. ");
                    System.out.println("Select your move:");
                    System.out.println("1. Rock");
                    System.out.println("2. Paper");
                    System.out.println("3. Scissors");
                    System.out.print("> ");
                    playerMoveChoice = sc.nextInt();
                    playerMove = switch (playerMoveChoice) {
                        case 1 -> rock;
                        case 2 -> paper;
                        default -> scissors;
                    };
                    
                    int computerChoice = (int) Math.floor(Math.random()*3) + 1;
                    computerMove = switch (computerChoice) {
                        case 1 -> rock;
                        case 2 -> paper;
                        default -> scissors;
                    };
                    
                    switch (rock.compareMoves(playerMove, computerMove)) {
                        case 0:
                            playerWins ++;
                            System.out.print("\n" + "Player chose " + playerMove.getName());
                            System.out.print(". Computer chose " + computerMove.getName());
                            System.out.println(". Player wins round!");
                            System.out.print("Player: " + playerWins + " - ");
                            System.out.println("Computer: " + computerWins + "\n");
                            break;
                        case 1:
                            computerWins ++;
                            System.out.print("\n" + "Player chose " + playerMove.getName());
                            System.out.print(". Computer chose " + computerMove.getName());
                            System.out.println(". Computer wins round!");
                            System.out.print("Player: " + playerWins + " - ");
                            System.out.println("Computer: " + computerWins + "\n");
                            break;
                        case 2:
                            System.out.print("\n" + "Player chose " + playerMove.getName());
                            System.out.print(". Computer chose " + computerMove.getName());
                            System.out.println(". Round is tied!");
                            System.out.print("Player: " + playerWins + " - ");
                            System.out.println("Computer: " + computerWins + "\n");
                            break;
                    }
                }
                if(playerWins > computerWins) {System.out.println("Player Wins!" + "\n");}
                else {System.out.println("Computer Wins!" + "\n");}
            }
            else if (playerChoice == 2) {
                System.out.println("How many wins are needed to win a match?");
                System.out.print("> ");
                roundsToWin = sc.nextInt();
                System.out.println("\n" + "New setting has been saved!" + "\n");
            }
        }
        while (playerChoice != 3);
        System.out.println("Thank you for playing!");
    }
    
}
