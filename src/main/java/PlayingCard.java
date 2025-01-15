import java.util.Objects;

public class PlayingCard {
    CardValue value;
    CardSuit suit;

    public PlayingCard(CardValue value, CardSuit suit) {
        this.value = value;
        this.suit = suit;
    }

    public CardValue getValue() {
        return value;
    }

    public CardSuit getSuit() {
        return suit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlayingCard that = (PlayingCard) o;
        return value == that.value && suit == that.suit;
    }


    @Override
    public int hashCode() {
        return Objects.hash(value, suit);
    }

    @Override
    public String toString() {
        return value + " of " + suit ;
    }
}
