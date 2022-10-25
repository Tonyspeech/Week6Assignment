package warApp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
   
  /**
   * ArrayList impimentented class 'Card' to get access to the cards.
   */
  List<Card> cards = new ArrayList<Card>();
  final int TOP_CARD = 0;
  
  
      /**
       * Method Deck iterates through all possibilities of paramters set for cardNumbers and cardSuits
       */
         public Deck() {
           for (int cardNumber = 2; cardNumber <= 14; cardNumber++) {
             for (int cardSuit = 0; cardSuit < 4; cardSuit++) {
               cards.add(new Card(cardSuit,cardNumber));
             }
           }
         }
  
         
         // From the implementation Card, we created 'cards' for ArrayList and want to getCards whenever we call for it
         public List<Card> getCards() {
           return cards;
         }
         
         // We use a setter because don't want the user to set any more cards outside of the paramters already set.
         public void setCard(List<Card> cards) {
           this.cards = cards; // this.cards calls for ArrayList cards on (line12) and sets it to the method we created for setCard
         }
 
         // Collections.shuffle creates a method where cards are printed randomly, so we don;t draw in order from the List
         public void shuffle() {
           Collections.shuffle(cards);
         }
         
         
         // for each cardDrawn, we want to remove it. We only want to do so if the cards are not empty. If there are no more cards, returns null.
         public Card Drawn() {
           if (cards.isEmpty()) {
             return null;
           }
           else {
           Card cardDrawn = cards.get(TOP_CARD);
           cards.remove(TOP_CARD);
           return cardDrawn;
           }
         }
         
}
