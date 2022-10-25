package warApp;

public class Card {

  public static final int SPADES = 0;
  public static final int HEARTS = 1;
  public static final int CLUBS = 2;
  public static final int DIAMONDS = 3;
  
  
  public static final int JACK = 11;
  public static final int QUEEN = 12;
  public static final int KING = 13;
  public static final int ACE = 14;
  
  private int cardNumber;
  private int cardSuit;
  
  
  
     public Card(int cardSuit, int cardNumber) {
       this.cardSuit = cardSuit;
       this.cardNumber = cardNumber;
     }
  
     /**
      * Sets the cardNumber for anything greater than what's inputed. Anything outside of paramters set will throw an Exception stating what card
      * values should be. Used so we don't immidiatlty crash the program if error occurs 
      * @param newCardNumber
      */
    
     public void setCardNumber(int newCardNumber) {
       if (newCardNumber < 2 || newCardNumber > 14) {
         throw new IllegalArgumentException("Card number needs to be between 2 and 14. ");
       }
       this.cardNumber = newCardNumber;
     }
    
     
     
     public void setCardSuit(int newCardSuit) {
       if (newCardSuit >= 0 && newCardSuit <=3) {
         this.cardNumber = newCardSuit;
       }
       else {
         throw new IllegalArgumentException("Card name needs to be between 0 and 3. ");
       }
     }
    
     /**
      * 
      * @return the values output when we call for it
      */
     
    public int getCardNumber() {
      return cardNumber;
      
    }
    
    public int getCardSuit() {
      return cardSuit;
      
    }
    
  
    
    /**
     * the actual making of the cards
     * @return 'info' which we made a string to return the values of that String
     */
    
    
    public String cardInfo() {
      String info = "";
      
         if (cardNumber == 2) {
           info += "Two";
         } 
         else if (cardNumber == 11) {
           info += "Jack";
         }
         else if (cardNumber == 12) {
           info += "Queen";
         }
         else if (cardNumber == 13) {
           info += "King";
         }
         else if (cardNumber == 14) {
           info += "Ace";
         }
         else if (cardNumber == 3) {
           info += "Three";
         } 
         else if (cardNumber == 4) {
           info += "Four";
         }
         else if (cardNumber == 5) {
           info += "Five";
         }
         else if (cardNumber == 6) {
           info += "Six";
         }
         else if (cardNumber == 7) {
           info += "Seven";
         }
         else if (cardNumber == 8) {
           info += "Eight";
         }
         else if (cardNumber == 9) {
           info += "Nine";
         }
         else if (cardNumber == 10) {
           info += "Ten";
         }
         else if (cardNumber == JACK) {
           info += JACK;
         }
         else if (cardNumber == QUEEN) {
           info += QUEEN;
         }
         else if (cardNumber == KING) {
           info += KING;
         }
         else if (cardNumber == ACE) {
           info += ACE;
         }
         
         info += " of ";
         
         if (cardSuit == SPADES) {
           info += "SPADES";
         }
         else if (cardSuit == HEARTS) {
           info += "HEARTS";
         }
         else if (cardSuit == CLUBS) {
           info += "CLUBS";
         }
         else if (cardSuit == DIAMONDS) {
           info += "DIAMONDS";
         }
         
     return info;
         
    }
    
     public void describeCard() {
       System.out.println(this.cardInfo());
     }
    
    
    
}
