package labs_examples.arrays.labs;
import java.util.Scanner;
import java.util.Arrays;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] userNums = new int[10];
        int count = 0;
        int sum = 0;
        double avg;

        while(count<10){
            System.out.print("Please enter a number: ");
            userNums[count] = scanner.nextInt();
            count++;
        }

        for(int num : userNums){
            sum += num;
        }
        avg = (double)(sum)/10;
        System.out.println("sum is: "+sum);
        System.out.println("average is: "+avg);
    }

}