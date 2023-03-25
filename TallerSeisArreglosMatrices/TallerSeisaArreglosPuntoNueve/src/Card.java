public class Card {
    private int suit;
    private int value;
    
    public Card(int suit, int value) {
        this.suit = suit;
        this.value = value;
    }
    
    public int getPoints() {
        if (value > 10) {
            return 10;
        } else {
            return value;
        }
    }
    
    public String toString() {
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] values = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        return values[value-1] + " of " + suits[suit-1];
    }
}
