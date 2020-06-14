package CardFun.Utilities;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import CardFun.Interfaces.Card;

public class DeckUtils {
   
    private DeckUtils() {}

    /** 
     * This implementation traverses the list backwards, from the last element up to the second, repeatedly swapping a
     * randomly selected element into the "current position". Elements are randomly selected from the portion of the
     * list that runs from the first element to the current position, inclusive.
     * 
     * @param deck The deck to be shuffled
     * @see java.util.Collections#shuffle(List) Collections already has a fisher-yated implementation.
     * But for the sake of the excercise, I'm implementing it here also.
     */
    public static <T extends Card> void fisherYatesShuffle(List<T> deck) {
        if (deck == null) throw new IllegalArgumentException();

        Random randNumGenerator = ThreadLocalRandom.current();
        for (int i = deck.size() - 1; i > 0; i--)
        {
            int swapIndex = randNumGenerator.nextInt(i + 1);
            T swapValue = deck.get(swapIndex);

            deck.set(swapIndex, deck.get(i));
            deck.set(i, swapValue);
        }
    }

    /**
     * Remove and return one card from the top of the deck.
     */
    public static <T extends Card> T dealOneCardOffTheTop(List<T> deck) {
        if (deck == null) throw new IllegalArgumentException();
    
        int lastIndex = deck.size() - 1;
        if(lastIndex < 0)  throw new NoSuchElementException();

        return deck.remove(lastIndex);
    }
}