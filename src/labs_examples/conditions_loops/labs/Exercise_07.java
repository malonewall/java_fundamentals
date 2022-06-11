package labs_examples.conditions_loops.labs;
import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 *      Hints:
 *          - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 *          - you'll likely want to use a String that contains all the vowels:
 *              - ie: String vowels = "aeiou";
 *
 */

public class Exercise_07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a real word: ");
        String userWord = scanner.next();
        String vowels = "aeiou";

        int i=0;
        boolean enterIf = false;
        String letter;

        while(i<userWord.length()){
            letter = Character.toString(userWord.charAt(i));
            if(vowels.contains(letter)){
                System.out.println("Your word, " +userWord + ", has its first vowel of: " + userWord.charAt(i));
                enterIf = true;
                break;
            }
            i++;
        }
        if(!enterIf){
            System.out.println("Your word, " +userWord + ", has no vowels.");
        }
    }
}
