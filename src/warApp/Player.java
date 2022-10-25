package warApp;

import java.util.ArrayList;
import java.util.List;

public class Player {

  String name;
  /**
   * ArrayList implemented from Class Card, hand is made because cards will be in each players hand
   */
  List<Card> hand = new ArrayList<Card>(); // We use an ArrayList in case we need to add or delete, rather than set it to a specific value.
  int score; // Keeps track of score
  int TOP_CARD;  // keeps track of top card. Key because we may need to delete the top card or add the top card
  
  
          // For each player, there wil be a String and an int. Which we value fpor their name, and the score of that player
          public Player(String name) {
            this.name = name;
            this.score = 0;
          }
          
          // Method created to see the cards in each players hand
          public void describeHand() {
            System.out.println("\nPlayer - " + name + ":" + "\tCards in hand: " + "\n");
            
               for(Card card : hand) {
                 card.describeCard();
               }
          }
          
          
          // 52 cards are in a deck, each player will have half that. So iterate through 26 cards 
          public void draw(Deck deck) {
            for (int i = 1; i <= 26; i++) {
              Card card = deck.Drawn();
              hand.add(card);
            }
          }
          
          // For each card flipped, we want to get rid of the current card and return a new card
          public Card flip() {
            Card flippedCard = hand.get(TOP_CARD);
            hand.remove(TOP_CARD);
            return flippedCard;
          }
          
          
          public void incrementedScore() {
            this.score++;
            
          }
}
