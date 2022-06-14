package labs_examples.objects_classes_methods.labs.methods;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {

        // please create the methods as instructed below then
        // call each of those methods from here, within the main()
        System.out.println("Mutliply 5 by 7: "+multiply(5,7));
        System.out.println("Divide 15 by 4: "+divide(15,4));
        funnyJoke();
        System.out.println("How many seconds in 4 years? "+yearsToSeconds(4));
        System.out.println("How many numbers did I sent to the method? "+numberOfArgs(4, 3, 65, 23, 42,3, 342, 532));

    }


    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b
    public static int multiply(int a, int b){
        return a*b;
    }


    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b
    public static double divide(int a, int b){
        double c = a;
        double d = b;
        return c/d;
    }


    // 3) Create a static void method that will print of joke of your choice to the console
    public static void funnyJoke(){
        System.out.println("How did the blonde get fired from the m&m factory?");
        System.out.println("She kept throwing away all of the w's");
    }


    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents
    public static long yearsToSeconds(int years){
        return years * 31556952;
    }


    // 5) Create a varargs method that will return the length of the varargs array passed in
    public static int numberOfArgs(int...nums){
        int count=0;
        for(int num : nums){
            count++;
        }
        return count;
    }






}
