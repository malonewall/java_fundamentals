package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 2: Days of the week
 *
 *      Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 *      if the number from the user is 1, 2,... 7, or other respectively. Use an if-else statement
 *      to accomplish this task.
 * 
 *      Bonus Tricky Challenge: Use a "nested-if" statement.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {
    
        // write completed here
        // create scanner
        Scanner scanner = new Scanner(System.in);
        // prompt user
        System.out.print("Enter a number between 1 and 7: ");
        // assign input to variable as int
        int number = scanner.nextInt();

        while(true)
            if(number == 1){
                System.out.println("Monday");
                break;
            }
            else if(number ==2){
                System.out.println("Tuesday");
                break;
            }
            else if(number ==3){
                System.out.println("Wednesday");
                break;
            }
            else if(number ==4){
                System.out.println("Thursday");
                break;
            }
            else if(number ==5){
                System.out.println("Friday");
                break;
            }
            else if(number ==6){
                System.out.println("Saturday");
                break;
            }
            else if(number ==7){
                System.out.println("Sunday");
                break;
            }
            else {
                System.out.println("Please choose a number between 1 and 7: ");
                number = scanner.nextInt();
            }

    }
}
