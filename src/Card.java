/*
 * class to get card descriptions
 */
public class Card {
	
	private String code, finalValue, finalBook;
	private char value;
	private char book;
	private boolean unknown = false;
	
	public Card(String input)
	{
		code = input;
	}

	public String getDescription()
	{
		int length = code.length();
		if(length == 2)
		{
			value = code.charAt(0);
			book = code.charAt(1);
		}
		else
		{
			finalValue = "Ten";
			book = code.charAt(2);
		}	
		convert();
		if (unknown == true)
			return "unknown";
		return finalValue + " of " + finalBook;
	}
	
	private void convert()
	{
		if(value == 'A')
			finalValue = "Ace";
		else if(value == '2')
			finalValue = "Two";
		else if(value == '3')
			finalValue = "Three";
		else if(value == '4')
			finalValue = "Four";
		else if(value == '5')
			finalValue = "Five";
		else if(value == '6')
			finalValue = "Six";
		else if(value == '7')
			finalValue = "Seven";
		else if(value == '8')
			finalValue = "Eight";
		else if(value == '9')
			finalValue = "Nine";
		else if(finalValue == "Ten")
			finalValue = "Ten";
		else if(value == 'J')
			finalValue = "Jack";
		else if(value == 'Q')
			finalValue = "Queen";
		else if(value == 'K')
			finalValue = "King";
		else
			unknown = true;
		
		if (book == 'D')
			finalBook = "diamonds";
		else if(book == 'H')
			finalBook = "hearts";
		else if(book == 'S')
			finalBook = "spades";
		else if(book == 'C')
			finalBook = "clubs";
		else
			unknown = true;
	}
}
