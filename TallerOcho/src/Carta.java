import java.util.Random;

public class Carta {
    String suit, name;
    int points;

    Carta(int n1, int n2) {
        suit = getSuit(n1);
        name = getName(n2);
        points = getPoints(name);
    }

    public String toString() {
        return "The " + name + " of " + suit;
    }

    public String getName(int i) {
        if (i == 1) return "Ace";
        if (i == 2) return "Two";
        if (i == 3) return "Three";
        if (i == 4) return "Four";
        if (i == 5) return "Five";
        if (i == 6) return "Six";
        if (i == 7) return "Seven";
        if (i == 8) return "Eight";
        if (i == 9) return "Nine";
        if (i == 10) return "Ten";
        if (i == 11) return "Jack";
        if (i == 12) return "Queen";
        if (i == 13) return "King";
        return "error";
    }

    public int getPoints(String n) {
        if (n == "Jack" || n == "Queen" || n == "King" || n == "Ten") return 10;
        if (n == "Ace") return 11;
        if (n == "Two") return 2;
        if (n == "Three") return 3;
        if (n == "Four") return 4;
        if (n == "Five") return 5;
        if (n == "Six") return 6;
        if (n == "Seven") return 7;
        if (n == "Eight") return 8;
        if (n == "Nine") return 9;
        return 0;
    }

    public String getSuit(int n) {
        if (n == 1) return "Hearts";
        if (n == 2) return "Diamonds";
        if (n == 3) return "Spades";
        if (n == 4) return "Clubs";
        return "error";
    }

    public static void main(String[] args) {
        Random random = new Random();
        Carta card1 = new Carta(random.nextInt(4) + 1, random.nextInt(13) + 1);
        Carta card2 = new Carta(random.nextInt(4) + 1, random.nextInt(13) + 1);

        System.out.println(card1.toString());
        System.out.println(card2.toString());
    }
}
