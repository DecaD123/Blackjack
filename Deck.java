//Name - Olamide Fadahunsi
//Date -

import java.util.ArrayList;
import java.util.Collections;

public class Deck //SUIT
{
	public static final int NUMFACES = 13;
	public static final int NUMSUITS = 4;
	public static final int NUMCARDS = 52;

	public static final String SUITS[] = {"CLUBS","SPADES","DIAMONDS","HEARTS"};

	private int topCardIndex;
	private ArrayList<Card> stackOfCards;

	public Deck ()
	{
		//initialize data - stackOfCards - topCardIndex
		topCardIndex = NUMCARDS -1;
		stackOfCards = new ArrayList<Card>();
		//loop through suits
		for(int i = 0; i < SUITS.length; i++ )
		{
			//loop through faces
			for(int j = 1; j < 1 + NUMFACES; j++)
			{
				//add in a new card
				stackOfCards.add(new BlackJackCard(j, SUITS[i]));
			}
		}
	}

	//modifiers
   public void shuffle ()
	{
		//shuffle the deck
		//reset variables as needed
		ArrayList<Card> shuffled = new ArrayList<Card>();
		topCardIndex = NUMCARDS -1;
		
		for(int i = 0; i < NUMCARDS; i++)
		{
			int rand = (int)(Math.random()* stackOfCards.size());
			shuffled.add (stackOfCards.remove(rand));
		}
		
		stackOfCards = shuffled;
	}

   //accessors
	public int  size ()
	{
		return NUMCARDS;
	}

	public int numCardsLeft()
	{
		return topCardIndex +  1;
	}

	public Card nextCard()
	{
		return stackOfCards.get(topCardIndex--);
	}

	public String toString()
	{
		return stackOfCards + "   topCardIndex = " + topCardIndex;
	} 
}