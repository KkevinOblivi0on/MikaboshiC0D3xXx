import java.util.Random;

public class Deck {
    private Card[] cardArray = new Card[52];
    private int index = 0;
    
    public Deck() {
        int suits = 4;
        int cardType = 13;
        int cardCount = 0;
        for(int i = 1; i <= suits; i++) {
            for(int j = 1; j <= cardType; j++) {
                cardArray[cardCount] = new Card(i,j);
                cardCount++;
            }
        }
    }
    
    public void shuffle() {
        Random random = new Random();
        for (int i = 0; i < cardArray.length; i++) {
            int randomIndex = random.nextInt(cardArray.length);
            Card temp = cardArray[i];
            cardArray[i] = cardArray[randomIndex];
            cardArray[randomIndex] = temp;
        }
    }
    
    public Card draw() {
        Card drawnCard = cardArray[index];
        index++;
        return drawnCard;
    }
}

