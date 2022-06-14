package labs_examples.objects_classes_methods.labs.methods;

import videos_source_code.classes.Person;

import java.util.ArrayList;

public class MethodTraining {
    public static void main(String[] args) {
        //call the other methods

        //overloading example
        printWords("Hi", "there");
        printWords("Hi", "there", "strange", "man");

        //pass by reference vs. pass by value
        Person molly = new Person(34, 6, "Molly");
        System.out.println(molly.name + " is " + molly.age + " years old.");
        changeAge(molly);
        System.out.println(molly.name + " is " + molly.age + " years old.");
        int a = 6;
        int b = 7;
        System.out.println("a before: "+a +" , b before: "+b);
        doubleNum(a, b);
        System.out.println("a after: "+a +" , b after: "+b);

        //return largest of 4 numbers
        int bigNum = largestOfFour(-3453, -534, -8, -65);
        System.out.println(bigNum);

        //count # of consonants
        System.out.println("Number of consonants in 'chicken wing': "+numOfConsonants("chicken wing"));

        //check whether a number is prime
        System.out.println("12 is a prime number: "+isPrime(12));

        //return array with high and low values
        int[] testing = {4, 7, 2, -5, 8, 0};
        int[] results = highLow(testing);// get it to print out properly
        System.out.println("High/Low array testing results: ");
        for(int num : results){
            System.out.println(num);
        }

        //ArrayList with divisors
        ArrayList<String> numbers = div(50, 3, 4);
        int count = 0;
        for(String n : numbers){
            System.out.print(n + " ");
            count++;
        }
        System.out.println("ArrayList contains " +count+ " values.");

        //reverse array
        int[] reverseThis = {4, 7, 2, 24, 65, 87, 92, -4};
        reverseThis = reverseArray(reverseThis);
    }

    //overloading example
    public static void printWords(String str, String str2){
        System.out.println(str+" "+str2+".");
    }
    public static void printWords(String str1, String str2, String str3, String str4){
        System.out.println(str1+" "+str2+" "+str3+" "+str4+".");
    }

    //pass by reference vs. pass by value
    public static void changeAge(Person person){ //pass by reference
        person.age = person.age + 1;
        return;

    }
    public static void doubleNum(int a, int b){
        a = a*2;
        b = b*2;
        return;
    }

    //largest of 4 numbers
    public static int largestOfFour(int a, int b, int c, int d){
        int largest = a;
        int[] nums = {b, c, d};
        for (int num :nums){
            if(num > largest){
                largest = num;
            }
        }
        return largest;
    }

    //count the consonants in a String
    public static int numOfConsonants(String str){
        int count = 0; // count number of consonants
        int i = 0; //iterate each character
        String letter;
        String vowels = "aeiou";
        while(i < str.length()){
            letter = Character.toString(str.charAt(i));
            if(!vowels.contains(letter) & !(letter.equalsIgnoreCase(" "))){
                count++;
            }
            i++;
        }

        return count;
    }

    //prime check
    public static boolean isPrime(int num){
        //how to check for prime number?
        if(num <= 1){
            return false;
        }
        for(int i=2; i<num/2; i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    //return an array containing highest and lowest values from a given array
    public static int[] highLow(int[] nums){
        int high = nums[0];
        int low = nums[0];
        for(int num : nums){
            if(num > high){
                high = num;
            }
            if(num< low){
                low = num;
            }
        }
        int[] hiLo = {low, high};
        return hiLo;
    }

    //takes 3 arguments, finds all numbers divisible by both numbers passed
    public static ArrayList<String> div(int maxNum, int divisor1, int divisor2){
        ArrayList<String> nums = new ArrayList<>();
        for(int i=0; i<=maxNum; i++){
            if((i%divisor1==0) && (i%divisor2 == 0)){
                String num = Integer.toString(i);
                nums.add(num);
            }
        }
        return nums;

    }

    public static int[] reverseArray(int[] values){
        for(int i=0; i<values.length/2; i++){
            int temp = values[i];
            values[i] = values[values.length - 1 -i];
            values[values.length - 1 -i] = temp;
        }

        return values;
    }

}

