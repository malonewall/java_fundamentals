package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all arithmetic operators below. These include:
 *
 * addition, subtraction, multiplication, division and modulus
 *
 */
class ArithmeticOperators {

    public static void main(String[] args) {

        // write your code below
        int num1 = 25;
        int num2 = 4;

        System.out.println("Your two numbers are " + num1 + " and " + num2);
        int add = num1 + num2;
        System.out.println("addition: " + add);

        int sub = num1 - num2;
        System.out.println("subtraction: " + sub);

        int mult = num1 * num2;
        System.out.println("multiplication: " + mult);

        int div = num1 / num2;
        System.out.println("division: " + div);

        int mod = num1 % num2;
        System.out.println("modulus: " + mod);

    }

}
