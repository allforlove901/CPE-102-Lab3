/*
 * A class for computing largest and smallest values
 */

public class DataSet
{
	private int[] numbers = new int[4];
	private int indexValue = 0;
	
	public void addvalue(int x)
	{
		numbers[indexValue] = x;
		indexValue++;
	}
	
	
	/*
	 * method for getting largest value
	 */
	public int getLargest()
	{
		int output = numbers[0];
		for (int r = 1; r<indexValue; r++)
		{
			if(numbers[r]>output)
			{
				output = numbers[r];
			}
		}
		return output;
	}
	
	/*
	 * method for getting smallest value
	 */
	public int getSmallest()
	{
		int output = numbers[0];
		for (int r = 1; r<indexValue; r++)
		{
			if(numbers[r]<output)
			{
				output = numbers[r];
			}
		}
		return output;
	}
}
