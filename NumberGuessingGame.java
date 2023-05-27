import java.util.*;
import java.util.Random;
import javax.swing.*;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Maximum Attempts:");
             int maxAttempts=s.nextInt();
        System.out.println("Enter the no.of Rounds:");
             int Rounds=s.nextInt();
        Random random = new Random();
        int minRange = 1;
        int maxRange = 100;
        int Totalscore=0;
        for (int round = 1; round <= Rounds; round++) {
        int NoToGuess = random.nextInt(maxRange - minRange);
        int NoOfAttempts = 0;
        int Roundscore = 0;
        
        
        while (NoOfAttempts < maxAttempts) {
            int NoOfguessed = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Round : " + round + "Guess the number between " + minRange + " and " + maxRange + ": "));
            NoOfAttempts++;
            
            if (NoOfguessed == NoToGuess) {
                Roundscore = maxAttempts - NoOfAttempts + 1;
                Totalscore+=Roundscore;
                JOptionPane.showMessageDialog(null,
                    "Congratulations! You guessed the number in " + NoOfAttempts + " attempts. Your score is " + Roundscore + ".");
                break;
            } else if (NoOfguessed < NoToGuess) {
                JOptionPane.showMessageDialog(null, "Your guess is lower than generated random number. Try again.");
            } else {
                JOptionPane.showMessageDialog(null, "Your guess is higher than generated random number. Try again.");
            }
        }
        
        if (NoOfAttempts == maxAttempts) {
            JOptionPane.showMessageDialog(null,
                "Attention!!!, you have reached the maximum number of attempts. The number was " + NoToGuess + ".");
        }
    }
    JOptionPane.showMessageDialog(null, "Game over!!! Your total score is " + Totalscore +":");
     } 
}
