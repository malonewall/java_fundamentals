package labs_examples.conditions_loops.labs;
import java.util.Scanner;
/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 *
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a lower bound: ");
        int lowerBound = scanner.nextInt();

        System.out.println("Please enter an upper bound: ");
        int upperBound = scanner.nextInt();

        int sum = 0;
        int count = 0;

        while(upperBound <= lowerBound){
            System.out.println("Please enter an upper bound that is greater than your lower bound: ");
            upperBound = scanner.nextInt();
        }

        for(int i = lowerBound; i<=upperBound;i++){
            sum+=i;
            count++;
        }
        System.out.println("The sum is: " + sum);
        System.out.println("The average is: " + ((double)sum/count));
    }
}
