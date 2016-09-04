/*
 * Class to test DataSet class
 */
public class DataSetTester {

	public static void main(String[] args)
	{
		DataSet data = new DataSet();
		data.addvalue(10);
		data.addvalue(20);
		data.addvalue(30);
		data.addvalue(25);
		
		System.out.println(data.getLargest());
		System.out.println("Expected: 30");
		
		System.out.println(data.getSmallest());
		System.out.println("Expected: 10");
	}
}
