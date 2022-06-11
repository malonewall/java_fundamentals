package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 10: continue
 *
 *      Demonstrate the use of the "continue" statement to skip to the next iteration of a loop.
 *
 */

public class Exercise_10 {
    public static void main(String[] args) {
        int num = 0;
        int sum = 0;
        while(num < 100){
            System.out.println("num is " +num);
            System.out.println("sum is " +sum);
            num++;
            if(num == 6){
                continue;
            }
            sum+=num;

        }
    }
}
