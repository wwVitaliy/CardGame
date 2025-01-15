import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Card Game
 * Develop a Java program to simulate a card game.
 * A player is dealt three random cards (from a pack of 52) with values ranging from 1-13.\
 * The program should generate three random cards.
 * Aces are low in value (1) and Kings are high in value (13).
 * Jokers aren’t played.
 * <p>
 * The player beats the house (wins the game),
 * if the sum of the three cards dealt is less than or equal to 21.
 * Otherwise, the house wins.
 * A duplicate card (for example, Ace of Clubs, should not be generated).
 */
public class CardGame {
    public static void main(String[] args) {
        Set<PlayingCard> cards = new HashSet<>();
        while (cards.size() < 3) {
            cards.add(generateRandomCard());
        }
        int score = 0;
        for (PlayingCard card : cards) {
            System.out.println(card);
            score += card.getValue().ordinal() + 1;
        }
        System.out.println("Your score is: " + score);
        System.out.print("Result - ");
        if (score <= 21) {
            System.out.println("Victory - You beat the house!");
        } else {
            System.out.println("Defeat - house wins!");
        }

    }

    private static PlayingCard generateRandomCard() {
        CardValue value = CardValue.values()[new Random().nextInt(CardValue.values().length)];
        CardSuit suit = CardSuit.values()[new Random().nextInt(CardSuit.values().length)];
        return new PlayingCard(value, suit);
    }
}
