package CardFun.Interfaces;

public interface Deck<T extends Card> {
    public void shuffle();
    public T dealOneCard();
}