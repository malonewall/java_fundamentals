package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Player {

    String name;
    Hand hand = new Hand();
    int potValue;

    public Player(){}

    public Player(String name){
        this.name = name;
    }

    public boolean computerAI(){
        if(hand.getHandValue() <16){
            return true;
        }
        else
            return false;

    }
}
