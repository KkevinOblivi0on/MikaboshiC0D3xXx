import java.util.Scanner;

public class PrincipalClass {
    public static void main(String args[]) {
        Deck d = new Deck();
        d.shuffle(); 
        Hand playerHand = new Hand();
        playerHand.addCard(d.draw());
        playerHand.addCard(d.draw());
        playerHand.showHand();
        int playerPoints = playerHand.getPoints();
        while (playerPoints <= 21) {
            System.out.println("Total points: " + playerPoints);
            System.out.println("Do you want another card? (Y/N)");
            try (Scanner scanner = new Scanner(System.in)) {
				String answer = scanner.nextLine();
				if (answer.equalsIgnoreCase("Y")) {
				    Card drawnCard = d.draw();
				    playerHand.addCard(drawnCard);
				    playerHand.showHand();
				    playerPoints = playerHand.getPoints();
				} else {
				    break;
				}
			}
        }
        if (playerPoints > 21);
                              }
                     }