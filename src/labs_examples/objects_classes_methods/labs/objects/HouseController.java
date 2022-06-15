package labs_examples.objects_classes_methods.labs.objects;

public class HouseController {
    public static void main(String[] args) {
        Homeowner person = new Homeowner("Malone", 26);
        SizeOfHouse size = new SizeOfHouse(2600, 4, 3);
        Finishings finishings = new Finishings("hardwood", "granite", "gray");
        House home = new House(size, finishings);

        System.out.println(person.name + " owns a home that is " + home.sizeOfHouse.squareFeet +
                " square feet and has " + home.sizeOfHouse.numberOfBedrooms + " bedrooms and " +
                home.sizeOfHouse.numberOfBathrooms + " bathrooms.");

        System.out.println("By the way, " + person.name + " is only "+ person.age + " years old!! Good for her.");


    }
}

class House{
    SizeOfHouse sizeOfHouse;
    Finishings finishings;

    public House(SizeOfHouse sizeOfHouse, Finishings finishings) {
        this.sizeOfHouse = sizeOfHouse;
        this.finishings = finishings;
    }

}

class SizeOfHouse {
    int squareFeet;
    int numberOfBedrooms;
    int numberOfBathrooms;

    public SizeOfHouse(int squareFeet, int numberOfBedrooms, int numberOfBathrooms) {
        this.squareFeet = squareFeet;
        this.numberOfBedrooms = numberOfBedrooms;
        this.numberOfBathrooms = numberOfBathrooms;
    }
}

class Finishings{
    String flooring;
    String counterTops;
    String paintColor;

    public Finishings(String flooring, String counterTops, String paintColor) {
        this.flooring = flooring;
        this.counterTops = counterTops;
        this.paintColor = paintColor;
    }
}

class Homeowner{
    String name;
    int age;

    public Homeowner(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
