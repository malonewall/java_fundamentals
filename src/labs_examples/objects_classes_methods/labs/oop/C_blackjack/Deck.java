package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;

public class Deck {
    Card[] cards = new Card[52];
    ArrayList<Integer> usedCards = new ArrayList<>();

    public Deck(){
        populate();
    }

    public void populate(){
        for(int s=0; s<4; s++){ //s for suit
            for(int r=0; r<13; r++){ //r for rank
                Card example = new Card();
                example.suit = example.suits[s];
                example.rank = example.ranks[r];
                //cards[(s*13)+r].suit = example.suits[s];
                //cards[(s*13)+r].rank = example.ranks[r];
                cards[(s*13)+r] = example;
            }
        }

    }

    public void deal(Player player){
        int num;
        do {
            num = (int) (Math.random() * 51);
        }while(usedCards.contains(num));
        player.hand.cards.add(cards[num]);
        usedCards.add(num);
    }

}
