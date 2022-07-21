package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Scanner;

public class BlackjackController {

    public static void main(String[] args) {
        playBlackJack();

    }

    public static void playBlackJack() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.next();
        Player computer = new Player();
        Player realPlayer = new Player(name);
        Deck deck = new Deck();
        deck.deal(computer);
        deck.deal(realPlayer);
        deck.deal(computer);
        deck.deal(realPlayer);

        System.out.println(realPlayer.hand.toString());
        System.out.println(realPlayer.hand.getHandValue());
        System.out.println("Would you like another card? (yes/no)");
        String answer = scanner.next();
        do{
            if (answer.equalsIgnoreCase("yes")) {
                deck.deal(realPlayer);
                System.out.println(realPlayer.hand.toString());
                System.out.println(realPlayer.hand.getHandValue());
            }
            if (computer.computerAI()) {
                deck.deal(computer);
                System.out.println("Computer took another card. Their hand: ");
                System.out.println(computer.hand.getHandValue());
            }
            else{
                System.out.println("Computer did not take another card. Their hand: ");
                System.out.println(computer.hand.getHandValue());
            }
            if(answer.equalsIgnoreCase("yes") && !realPlayer.hand.isGreaterThan21()){ //only asks again if they had said yes before
                System.out.println("Would you like another card? (yes/no)");
                answer = scanner.next();
            }
            else {
                answer = "no";
            }


        }while(answer.equalsIgnoreCase("yes") || computer.computerAI() ||
                (realPlayer.hand.isGreaterThan21() &&computer.hand.isGreaterThan21()));

        boolean playerBusted = false;
        boolean computerBusted = false;
        //declare winner and final scores
        System.out.println("Your final hand and score: ");
        System.out.println(realPlayer.hand.toString() + " with a value of: "+realPlayer.hand.getHandValue());
        if(realPlayer.hand.isGreaterThan21()){
            System.out.println("You busted");
            playerBusted = true;
        }
        System.out.println("Computer's final hand and score: ");
        System.out.println(computer.hand.toString() + " with a value of: "+computer.hand.getHandValue());
        if(computer.hand.isGreaterThan21()){
            System.out.println("Computer busted");
            computerBusted = true;
        }
        if(!realPlayer.hand.isGreaterThan21() && !computer.hand.isGreaterThan21()){
            if(realPlayer.hand.getHandValue() > computer.hand.getHandValue()){//real player wins
                System.out.println("You win!");
            }
            else if(computer.hand.getHandValue() > realPlayer.hand.getHandValue()) {//computer player wins
                System.out.println("Computer wins!");
            }
            else{
                System.out.println("You tied");
            }
        }
        if(playerBusted & !computerBusted){
            System.out.println("Computer wins!");
        }
        else if(!playerBusted & computerBusted){
            System.out.println("You win!");
        }
        else{
            System.out.println("No one wins");
        }

    }
}
