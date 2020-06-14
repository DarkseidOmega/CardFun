package CardFun.Concrete;

import CardFun.Interfaces.Deck;
import CardFun.Utilities.DeckUtils;
import CardFun.Enums.*;
import java.util.ArrayList;
import java.util.Comparator;

public class StandardPlayingCardDeck implements Deck<StandardPlayingCard> {
    
    private static final int DECK_SIZE = 52;
    private ArrayList<StandardPlayingCard> deck;
    
    public StandardPlayingCardDeck() {
        this.deck = new ArrayList<StandardPlayingCard>(DECK_SIZE);

        for(Suit suit : Suit.values()) {
            for(Face face: Face.values()){
                deck.add(new StandardPlayingCard(suit, face));
            }
        }
    }

    public void sort(Comparator<StandardPlayingCard> comparator) {
        this.deck.sort(comparator);
    }

    public boolean hasNext(){
        return this.deck != null && this.deck.size() >= 1;
    }

    public int cardsLeft() {
        return this.deck.size();
    }

    @Override
    public void shuffle() {
        DeckUtils.fisherYatesShuffle(this.deck);
    }

    @Override
    public StandardPlayingCard dealOneCard() {
        return DeckUtils.dealOneCardOffTheTop(this.deck);
    }
}