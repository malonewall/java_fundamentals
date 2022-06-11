package labs_examples.arrays.labs;
import java.util.ArrayList;

/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
public class Exercise_07 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Louis");
        names.add("Leonard");
        names.add("Yolanda");

        System.out.println("My best friend is named " +names.get(0));

        names.add(1, "Priscilla");
        System.out.println("My second best friend is named "+names.get(1));

        System.out.println("My list of friends is empty -- "+names.isEmpty());
        //names.removeAll(names);
        names.clear();
        System.out.println("What about now? " + names.isEmpty());

    }
}
