package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;

public class Hand {
    ArrayList<Card> cards = new ArrayList<>();
    private int handValue;

   public int getHandValue(){
       handValue = 0;
       for(Card card : cards){
           handValue += card.getCardValue(); //add the value of each card to the sum
       }
       return handValue;
   }

   public boolean isGreaterThan21(){
       handValue = getHandValue();
       if(handValue > 21){
           return true;
       }
       else
           return false;
   }

    @Override
    public String toString() {
       return "Hand{" +
                "cards=" + cards +
                '}';

    }
}
