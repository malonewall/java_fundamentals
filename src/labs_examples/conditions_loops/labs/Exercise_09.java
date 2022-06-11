package labs_examples.conditions_loops.labs;
import java.lang.Math;

/**
 * Conditions and Loops Exercise 9: break
 *
 *      Demonstrate the use of the "break" statement to exit a loop.
 *
 */

public class Exercise_09 {
    public static void main(String[] args) {
        int i = (int)(Math.random() * 10);
        while(true){
            System.out.println(i);
            if(i == 8){
                break;
            }
            i = (int)(Math.random() * 10);
        }
    }
}
