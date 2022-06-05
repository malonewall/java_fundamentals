package labs_examples.datatypes_operators.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_06 {
    static double pi = 3.14159;

    public static void main(String[] args) {

        // write code here
        double r = 3.14;
        double h = 5;
        System.out.println("Volume: " + volumeOfCylinder(r,h));
        System.out.println("Surface Area: " + surfaceAreaOfCylinder(r,h));


    }

    public static double areaOfCircle(double radius){

        return pi * radius * radius; // return area of circle
    }

    public static double circumference(double radius){
        return 2 * radius * pi; // return circumference of circle
    }

    public static double volumeOfCylinder(double radius, double height){
       //take in radius, call area method, multiply by height

        return areaOfCircle(radius) * height;
    }

    public static double surfaceAreaOfCylinder(double radius, double height){
        //take in radius, call area method, mutliply area by 2, call circumference method, multiply by h, add

        return (2 * areaOfCircle(radius)) + (circumference(radius) * height);
    }
}