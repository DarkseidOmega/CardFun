package CardFun.Concrete;

import CardFun.Abstract.AbstractDeck;
import CardFun.Enums.*;
import java.util.ArrayList;

public class StandardPlayingCardDeck extends AbstractDeck<StandardPlayingCard> {
    private static final int DECK_SIZE = 52;
    
    public StandardPlayingCardDeck() {
        ArrayList<StandardPlayingCard> deck = new ArrayList<>(DECK_SIZE);

        for(Suit suit : Suit.values()) {
            for(Face face: Face.values()){
                deck.add(new StandardPlayingCard(suit, face));
            }
        }
        setDeck(deck);
    }
}