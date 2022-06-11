package labs_examples.arrays.labs;

/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {
        String[][] names = {
                {"Fiona", "Felicia"},
                {"Gregor", "Geraldine", "Giovanni"},
                {"Hiacinth", "Hallie", "Hickory", "Hason"}
        };

        for(String[] array : names){
            for(String name : array){
                System.out.print(name + "\t\t");
            }
            System.out.println();
        }
    }
}
