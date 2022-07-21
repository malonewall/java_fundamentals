package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class AnimalController {

    public static class Mammal {

        int numLegs;

        public Mammal(int legs){
            this.numLegs = legs;
        }
        public void run(){
            System.out.println("Mammal running with " + numLegs + " legs.");
        }
    }
    public static class BigCat extends Mammal{
        public BigCat(int legs){
            super(legs);
        }

        @Override
        public void run() {
            System.out.println("Big Cat running with " + numLegs + " legs.");
        }
    }

    public static class Cheetah extends BigCat {
        public Cheetah(int legs){
            super(legs);
        }
    }

    public static class Jaguar extends BigCat {
        public Jaguar(int legs){
            super(legs);
        }

        @Override
        public void run() {
            System.out.println("Jaguar running with "+numLegs+ " legs.");
        }
    }

    public static class Human extends Mammal{
        public Human(int legs){
            super(legs);
        }

        @Override
        public void run() {
            System.out.println("Human running.");
        }
    }

    public static void main(String[] args) {

        Human greg = new Human(2);
        greg.run();

        BigCat lion = new BigCat(4);
        lion.run();

        BigCat jag = new Jaguar(4);
        jag.run();

        Cheetah ch = new Cheetah(4);
        ch.run();

    }

}
