package labs_examples.arrays.labs;
import java.util.Scanner;
import java.util.Arrays;

/**
 *  More labs_examples.arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        // write code here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number from 1-10: ");
        int userNum = scanner.nextInt();

        while(userNum < 1 || userNum >10){
            System.out.print("Please make sure your number is from 1-10: ");
            userNum = scanner.nextInt();
        }

        for(int i=0; i<array.length; i++){
            if(array[i] == userNum){
                System.out.println("Your number is found at index: " + i);
                break;
            }
        }

        //System.out.println(array.indexOf(userNum));


    }
}