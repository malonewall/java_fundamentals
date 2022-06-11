package labs_examples.arrays.labs;

/**
 *  2D Array
 *
 *      Create and populate a 5x5 2D array with multiples of 3, starting with 3. Once populated, print out the results.
 *
 *      The output should look something like this:
 *
 *      3 6 9 12 15
 *      18 21 24 27 30
 *      ...
 *      ...
 *      ...
 *
 */

public class Exercise_03 {

    public static void main(String[] args) {
        int[][] multOf3 = new int[5][5];
        int num = 3;

        for(int i=0; i< multOf3.length; i++){
            for(int j=0; j<multOf3[i].length; j++){
                multOf3[i][j] = num;
                num+=3;
            }
        }

        for(int[] array : multOf3){
            for(int element : array){
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }
}
