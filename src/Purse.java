import java.util.ArrayList;

/**
   A purse holds a collection of coins.
*/
public class Purse
{
   private ArrayList<String> coins;
   private int nickels, dimes, quarters;
   /**
      Constructs an empty purse.
   */
   public Purse()
   {
      coins = new ArrayList<String>();
   }

   /**
      Add a coin to the purse.
      @param coinName the coin to add
   */
   public void addCoin(String coinName)
   {
      coins.add(coinName);
   }

   /**
      Returns a string describing the object.
      @return a string in the format "Purse[coinName1,coinName2,...]"
   */
   public String toString()
   {
	  String output = "Purse[";
      for(int r = 0; r < coins.size(); r++)
    	  output += coins.get(r) + ",";
      if (coins.size() > 0)
    	  output = output.substring(0, output.length()-1);
	  output += "]";
	  return output;
   }

   /**
   Determines if a purse has the same coins in the same or different
   order as another purse.
   @param other the other purse
   @return true if the two purses have the same coins in the
         same or different order, false otherwise
    */
	public boolean sameCoins(Purse other)
	{
		this.countCoins();
		other.countCoins();
		if(this.quarters == other.quarters && this.dimes == other.dimes && this.nickels == other.nickels)
			return true;
		else
			return false;
	}   
	
	public void countCoins()
	{
		for(int r = 0; r < coins.size(); r++)
		{
			if(coins.get(r) == "Quarter")
	    		  quarters++;
			else if(coins.get(r) == "Dime")
	  		  dimes++;
			else if(coins.get(r) == "Nickel")
	  		  quarters++;
		}
	}
}