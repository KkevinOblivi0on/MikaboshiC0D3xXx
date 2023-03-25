import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> cardList = new ArrayList<Card>();
    
    public void addCard(Card card) {
        cardList.add(card);
    }
    
    public int getPoints() {
        int points = 0;
        int aceCount = 0;
        for (Card card : cardList) {
            points += card.getPoints();
            if (card.getPoints() == 1) {
                aceCount++;
            }
        }
        while (aceCount > 0 && points <= 11) {
            points += 10;
            aceCount--;
        }
        return points;
    }
    
    public void showHand() {
        for (Card card : cardList) {
            System.out.println(card);
        }
    }
}
