/*
 * class to calculate if a eyar is a leap year
 */
public class Year 
{
	private int year;
	
	/*
	 * constructor
	 * @param theYear the specified year
	 */
	public Year(int theYear)
	{
		year = theYear;
	}
	
	public boolean isLeapYear()
	{
		if (year%4 == 0)
		{
			if(year%100 == 0 && year%400 != 0)
				return false;
			else
				return true;
		}
		else
			return false;
	}
	
}
