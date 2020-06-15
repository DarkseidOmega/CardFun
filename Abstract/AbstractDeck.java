package CardFun.Abstract;

import java.util.Comparator;
import java.util.List;

import CardFun.Interfaces.Card;
import CardFun.Utilities.DeckUtils;

public abstract class AbstractDeck<T extends Card> {

    private List<T> deck;

    public void shuffle() {
        DeckUtils.fisherYatesShuffle(this.deck);
    }

    public T dealOneCard() {
        return DeckUtils.dealOneCardOffTheTop(this.deck);
    }

    public void sort(Comparator<T> comparator) {
        this.deck.sort(comparator);
    }

    public boolean hasNext(){
        return this.deck != null && this.deck.size() >= 1;
    }

    public int cardsLeft() {
        return this.deck.size();
    }

    protected void setDeck(List<T> deck) {
        this.deck = deck;
    }
}