/*
 * class to get time difference in hours and minutes
 */
public class TimeInterval 
{
	int time1;
	int time2;
	
	/*
	 * Constructor
	 * @param two military time values
	 */
	public TimeInterval(int x, int y)
	{
		time1 = x;
		time2 = y;
	}
	
	/*
	 * return time in hours
	 */
	public int getHours()
	{
		return getDifference()/60;

	}
	
	/*
	 * returns time in minutes
	 */
	public int getMinutes()
	{
		return getDifference()%60;
	}
	
	private int getDifference()
	{
		int total1 = (time1/100)*60 + time1%100; 
		int total2 = (time2/100)*60 + time2%100;
		
		if(total1<total2)
			return total2 - total1;
		else
		{
			return 1440 - (total1 - total2);
		}
	}
	
}
