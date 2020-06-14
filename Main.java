package CardFun;

import CardFun.Concrete.*;

public class Main {
    public static void main(String[] args) {

        StandardPlayingCardDeck rawInitializedDeck = new StandardPlayingCardDeck();
        
        StandardPlayingCardDeck naturallyOrderDeck = new StandardPlayingCardDeck();
        naturallyOrderDeck.sort(null);

        StandardPlayingCardDeck shuffledDeck = new StandardPlayingCardDeck();
        shuffledDeck.shuffle();

        System.out.println("\n Raw Initialization(" + shuffledDeck.cardsLeft() + ")=======================");
        while( rawInitializedDeck.hasNext()) {
            System.out.println(rawInitializedDeck.dealOneCard().toDisplayString());
        }


        System.out.println("\n Naturally Ordered Deck(" + shuffledDeck.cardsLeft() + ")=======================");
        while( naturallyOrderDeck.hasNext()) {
            System.out.println(naturallyOrderDeck.dealOneCard().toDisplayString());
        }

        System.out.println("\n Shuffled Deck(" + shuffledDeck.cardsLeft() + ")=======================");
        while( shuffledDeck.hasNext()) {
            System.out.println(shuffledDeck.dealOneCard().toDisplayString());
        }
        
      }
}