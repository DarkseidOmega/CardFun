package CardFun.Abstract;

import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import CardFun.Interfaces.Card;

public abstract class AbstractDeck<T extends Card> {

    private List<T> deck;

    protected AbstractDeck(List<T> deck) {
        this.deck = deck;
    }

    /**
     * This implementation traverses the list backwards, from the last element up to
     * the second, repeatedly swapping a randomly selected element into the "current
     * position". Elements are randomly selected from the portion of the list that
     * runs from the first element to the current position, inclusive.
     * 
     * @param deck The deck to be shuffled
     * @see java.util.Collections#shuffle(List) Collections already has a
     *      fisher-yated implementation. But for the sake of the excercise, I'm
     *      implementing it here also.
     */
    public void shuffle() {
        Random randNumGenerator = ThreadLocalRandom.current();
        for (int i = this.deck.size() - 1; i > 0; i--) {
            int swapIndex = randNumGenerator.nextInt(i + 1);
            T swapValue = this.deck.get(swapIndex);

            this.deck.set(swapIndex, this.deck.get(i));
            this.deck.set(i, swapValue);
        }
    }

    /**
     * Remove and return one card from the top of the deck.
     */
    public T dealOneCard() {
        if (this.deck.size() < 1)
            throw new NoSuchElementException(); // or return null ?

        return this.deck.remove(0);
    }

    public void sort(Comparator<T> comparator) {
        this.deck.sort(comparator);
    }

    public boolean hasNext() {
        return this.deck != null && this.deck.size() >= 1;
    }

    public int cardsLeft() {
        return this.deck.size();
    }

    protected void setDeck(List<T> deck) {
        this.setDeck(deck);
    }
}