package warApp; // App where 2 players draw cards and whoever has the MOST totalsum of higher cards wins

public class War { // class

  public static void main(String[] args) { // main method

    // Implementing a new Deck from class 'Deck' 
    Deck fullDeck = new Deck();
    
    // using the shuffle method from class "Deck' to shuffle all the cards before drawn
    fullDeck.shuffle();
    
    
    
    // From the class 'Players' we wil set a new Player to call those methods from that class 
    Player player1 = new Player("Nyla");
    Player player2 = new Player("Tony");
    
    // iterating through all the cards in each player hand. usin methods from Class 'Player' since that's what we set for player1&&player2
    for (int i = 1; i <= 26; i++) {
      player1.hand.add(fullDeck.Drawn());
      player2.hand.add(fullDeck.Drawn());
      
    }
    player1.describeHand(); // Used to see what each card both payers are holding
    player2.describeHand();
    
    
    
    for (int counter = 1; counter <= 26; counter++) {
     
      /**
       * implementing class 'Card' to each playerHandfor each card drawn, want each card flipped. Set parameters through all variotions 
       * of possible cards in each hand
       */
      Card player1Hand = player1.flip();
      Card player2Hand = player2.flip();

    
      
      /**
       * Each player that has the higher card, wan to increment there score
       */
      
    if (player1Hand.getCardNumber() > player2Hand.getCardNumber()) {
      player1.incrementedScore();
    }
    else if (player2Hand.getCardNumber() > player1Hand.getCardNumber()) {
      player2.incrementedScore();
    }
//    else { 
//      System.out.print("No Point!");   // Not need, set the equals part on the printout
//    }
    
      
    /**
     * from the if statement nested above, we want proof or may want to see how each player gets points. We will first get the card info
     * for both cards. For each HIGHER card drawn from whichever player, we will see the output of Who had the higher card. We will than tally up
     * the rounds each round until each card .isEmpty and we wiil return null. Created from the Drawn method in class 'Deck' we called for 
     * to each player(s) hand (line20-line22) Once each player is out of cards there will be no more printing of cards.
     */
    
    if (player1Hand.getCardNumber() > player2Hand.getCardNumber()) {
      
        System.out.print(player1.name + "(s) drawn card: " + player1Hand.cardInfo() + "\t");
        System.out.println(player2.name + "(s) drawn card: " + player2Hand.cardInfo());
        System.out.println("");
        
        System.out.println(player1.name + " had the higher card!!!");
        System.out.println(player1.name + " rounds won: " + player1.score);
        System.out.println(player2.name + " rounds won: " + player2.score);
        System.out.println("\n\n");
      }
    
    
    else if (player2Hand.getCardNumber() > player1Hand.getCardNumber()) {
      
        System.out.print(player1.name + "(s) drawn card: " + player1Hand.cardInfo() + "\t");
        System.out.println(player2.name + "(s) drawn card: " + player2Hand.cardInfo());
        System.out.println("");
        
        System.out.println(player2.name + " had the higher card!!!");
        System.out.println(player1.name + " rounds won: " + player1.score);
        System.out.println(player2.name + " rounds won: " + player2.score);
        System.out.println("\n\n");
      }
    
    
    else if (player1Hand.getCardNumber() == player2Hand.getCardNumber()) {
      
        System.out.print(player1.name + "(s) drawn card: " + player1Hand.cardInfo() + "\t");
        System.out.println(player2.name + "(s) drawn card: " + player2Hand.cardInfo());
        System.out.println("");
        
        System.out.println("Draw! No point recieved!!!");
        System.out.println(player1.name + " rounds won: " + player1.score);
        System.out.println(player2.name + " rounds won: " + player2.score);
        System.out.println("\n\n");
    }
    
    }
    
    
     
    // Finalizes the sum of rounds won by each player.
    System.out.print("\nFinal rounds won for " + player1.name + ": " + player1.score );
    System.out.println("\t------\t Final rounds won for " + player2.name + ": " + player2.score + "\n");
    
    
    
    
    // This a bonus work. Created for the winner to be clarified by asterisks surrounding the winner.
    String winner = "*** THE WINNER IS: "  + player1.name + " ***"; 
    String winner2 = "*** THE WINNER IS: " + player2.name + " ***";
    String draw = "DRAW! NOBODY WINS HAHAHAHA!!!";
    
    /**
     * outputs the winner to whom had the most rounds won. 
     */
    if (player1.score > player2.score) {
      for (int win = 0; win < winner.length(); win++) {
        System.out.print("*");
        
      }
      System.out.println("\n");
      System.out.println(winner.toUpperCase() + "\n");
      for (int win = 0; win < winner.length(); win++) {
        System.out.print("*");
       }
    }
    else if (player2.score > player1.score) {
      
      for (int win2 = 0; win2 < winner2.length(); win2++) {
        System.out.print("*");
        
      }
      System.out.println("\n");
      System.out.println(winner2.toUpperCase() + "\n");
      for (int win2 = 0; win2 < winner2.length(); win2++) {
        System.out.print("*");
      }
    }
    else if (player1.score == player2.score) {
      
      
      for (int tie = 0; tie < draw.length(); tie++) {
        System.out.print("*");
       
      }
      System.out.println("\n");
      System.out.println("DRAW! NOBODY WINS HAHAHAHA!!! \n");
      for (int tie = 0; tie < draw.length(); tie++) {
        System.out.print("*");
      }
    }
    
   
  
  
  

  
  
  }  // main method
  }   // class
