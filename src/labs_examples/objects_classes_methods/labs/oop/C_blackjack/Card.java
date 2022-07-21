package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Card {

    char[] suits = new char[]{'♠', '♦', '♥', '♣'};
    String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    String rank;
    char suit;


    public int getCardValue(){
        if(this.rank == "Ace"){
            return 1;
        }
        else if(this.rank == "Jack" || this.rank == "Queen" || this.rank == "King"){
            return 10;
        }
        else{
            return Integer.parseInt(this.rank);
        }
    }

    @Override
    public String toString() {
        /*return "Card{" +
                "rank='" + rank + '\'' +
                ", suit=" + suit +
                '}';*/
        return ""+rank + " of " + suit;
    }
}
