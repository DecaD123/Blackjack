//Name - Olamide Fadahunsi
//Date -

public class Card
{
	public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

	private String suit;
	private int face;

  	//constructors
  	//public no retun type calls the same name as class
	public Card()
	{
		suit = "";
		face = 0;
	}

	//additonal constructors could be: one for just a suit; one for just a face
	public Card(int face, String suit)
	{
		this.suit = suit;
		this.face = face;
	}
	// modifiers
	public void setSuit(String suit)
	{
		this.suit = suit;
	}
	
	public void setFace(int face)
	{
		this.face = face;
	}
  	//accessors

  	public int getValue()
  	{
  		return face;
  	}
	
	public String getSuit()
	{
		return suit;
	}
	
	public String getFace()
	{
		 return FACES[face];
	}
	
	public boolean equals(Object obj)
	{
		Card temp = (Card)obj;
		return temp.getValue()==face && temp.getSuit().equals(suit);
	}

  	//toString
  	//ZERO of  | value = 0
  	public String toString()
  	{
  		return "" + FACES[face] + "of" + getSuit() +  " | value =" + getValue();
  	}
 }