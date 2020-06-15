package CardFun.Concrete;

import CardFun.Enums.*;
import CardFun.Interfaces.Card;

public class StandardPlayingCard implements Card, Comparable<StandardPlayingCard> {

    private static final String DISPLAY_TEMPLATE = "%s of %s";
    private static final String TO_STRING_TEMPLATE = "{ suit: %s, face: %s, value: %s }";

    private Suit suit;
    private Face face;

    public StandardPlayingCard(Suit suit, Face face) {
        this.suit = suit;
        this.face = face;
    }

    public Face getFace() {
        return this.face;
    }

    public Suit getSuit() {
        return this.suit;
    }

    @Override
    public String toDisplayString() {

        return String.format(DISPLAY_TEMPLATE, this.face, this.suit);
    }

    @Override
    public String toString() {

        return String.format(TO_STRING_TEMPLATE, this.suit, this.face, this.face.getValue());
    }

    @Override
    public int compareTo(StandardPlayingCard o) {
        return this.face.compareTo(o.face);
    }
}