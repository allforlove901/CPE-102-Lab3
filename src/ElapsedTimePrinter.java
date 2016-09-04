import java.util.Scanner;

public class ElapsedTimePrinter {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the first time: ");
		int t1 = in.nextInt();
		System.out.println("Please enter the second time: ");
		int t2 = in.nextInt();
		TimeInterval time = new TimeInterval(t1, t2);
		
		System.out.println(time.getHours() + " hours " + time.getMinutes() + " minutes");
	}
}
