//Name - Olamide Fadahunsi
//Date -

import java.util.*;

public class Player
{
   private ArrayList<Card> phand;
   private int winCount;

   public Player ()
   {
      //initialize instance variables with some default values
      phand = new ArrayList<Card>();
      winCount = 0;
   }

   public Player (int score)
   {
      //initialize instance variables
      //score is simply the # of wins the player has
      winCount = score;
      phand = new ArrayList<Card>();
   }

   public void addCardToHand( Card temp )
   {
      //add temp to the player's hand
      phand.add(temp);
   }

   public void resetHand( )
   {
      // remove all cards from the player's hand
      for(int i = phand.size()-1; i >-1; i--)
      {
         phand.remove(i);
      }
   }

   public  void setWinCount( int numwins )
   {
      // setter/modifer method for winCount
      winCount = numwins;
   }

   public int getWinCount() 
   { 
      //accessor method for winCount
      
      return winCount; 
   }

   public int getHandSize() 
   { 
      // accessor method for # of cards in player's hand
      
      return phand.size();
   }
   
   public int getHandValue()
   {
      //accessor method to get the total value of all the cards in player's hand
            // Returns the value of this hand for the
            // game of Blackjack.

         int val;      // The value computed for the hand.
         boolean ace;  // This will be set to true if the
                       //   hand contains an ace.
         int cards;    // Number of cards in the hand.

         val = 0;
         ace = false;
         cards = getWinCount();

         for ( int i = 0;  i < cards;  i++ ) {
                 // Add the value of the i-th card in the hand.
             Card card;    // The i-th card; 
             int cardVal;  // The blackjack value of the i-th card.
             card = getCard(i);
             cardVal = card.getValue();  // The normal value, 1 to 13.
             if (cardVal > 10) {
                 cardVal = 10;   // For a Jack, Queen, or King.
             }
             if (cardVal == 1) {
                 ace = true;     // There is at least one ace.
             }
             val = val + cardVal;
          }

             // Now, val is the value of the hand, counting any ace as 1.
             // If there is an ace, and if changing its value from 1 to 
             // 11 would leave the score less than or equal to 21,
             // then do so by adding the extra 10 points to val. 

          if ( ace == true  &&  val + 10 <= 21 )
              val = val + 10;

          return val;

     } 
          return phandvalue;
         }
   }

   public  boolean  hit( )
   {
      // to be implemented in Part 5. This is the logic that determines wheter 
      //to deal another card.
      return false;
   }

   public String toString()
   {
      return "hand =" + card.getFace() + card.getSuit() +  " | value =" + card.getValue() + getHandValue;
   }
} 