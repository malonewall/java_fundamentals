package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all logical operators below. These include:
 *
 * AND, short-circuit AND, OR, short-circuit OR, XOR, NOT
 *
 */
class LogicalOperators {

    public static void main(String[] args) {

        // example of "OR"
        boolean a = true;
        boolean b = false;
        if (a | b){
            System.out.println("a or b is true");
        }

        // write your code below
        if (a & b){
            System.out.println("a and b are true"); // will not print
        }
        if (a || b){
            System.out.println("a or b is true"); //only had to check a
        }
        if (a && b){
            System.out.println("a and be are true"); // will not print. Had to check b only because a was true
        }
        if (a ^ b){
            System.out.println("a or b is true, but not both"); //will print
        }
        if (!b){
            System.out.println("b is false");
        }

    }

}

