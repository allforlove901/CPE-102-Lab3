
public class TaxReturn
{
	public static int MARRIED = 2;
	public static int SINGLE = 1;
	private static final double RATE1 = 0.10;
	private static final double RATE2 = 0.25;
	private static double rate1Limit = 32000;
	private double income;
	
	/*
	 * calculates tax return amount
	 */
	public TaxReturn(double incomeAmount, int marriageStatus) 
	{
		income = incomeAmount;
		if(marriageStatus == 2)
			rate1Limit = 64000;
	}
	public double getTax() 
	{
		double tax1 = 0;
		double tax2 = 0;
		
		if(income <= rate1Limit)
			tax1 = RATE1*income;
		else
		{
			tax1 = RATE1*income;
			tax2 = RATE2*(rate1Limit - income);
		}
		return tax1 + tax2; 
	}
}