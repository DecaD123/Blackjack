//Name - Olamide Fadahunsi
//Date -

public class BlackJackCard extends Card
{
  	//constructors
    public BlackJackCard()
    {
        super();
    }
    public BlackJackCard(int face, String suit)
    {
        super(face, suit);
    }


  	public int getValue()
  	{
  		//enables you to build the value for the game into the card
  		//this makes writing the whole program a little easier
        int temp = super.getValue();
        
        if(temp == 1)
        {
            return 11;
        }
        else if(temp > 10)
        {
            return 10;
        }
        else
        {
            return temp;
        }
  	}
  }