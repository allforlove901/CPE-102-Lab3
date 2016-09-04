/*
 * class to create and test basic line functions
 */
public class Line {

	private int YInt, vertXValue;
	private double slope;
	public boolean isVertical = false;
	
	/*
	 * constructor
	 * @param x-point, y-point, and slope
	 */
	public Line(int x, int y, double m)
	{
		slope = m;
		YInt = (int)(y - m*x);
	}
	
	/*
	 * constructor
	 * @param two points
	 */
	public Line(int x1, int y1, int x2, int y2)
	{
		if (x2-x1 == 0)
		{
			isVertical = true;
			vertXValue = x2;
		}
		else
			slope = (y2-y1)/(x2-x1);
	}
	
	/*
	 * constructor
	 * @param equation values
	 */
	public Line(double m, int b)
	{
		slope = m;
		YInt = b;
	}
	
	/*
	 * constructor
	 * @param an x value
	 */
	public Line(int x)
	{
		isVertical = true;
		vertXValue = x;
	}
	
	public boolean intersects(Line other)
	{
		if (this.slope == other.slope)
			return false;
		else
			return true;
	}
	
	public boolean equals(Line other)
	{
		if (this.isVertical && other.isVertical)
		{
			if (this.vertXValue == other.vertXValue)
				return true;
			else
				return false;
		}
		else if(this.isVertical || other.isVertical)
			return false;
		else if (this.slope == other.slope && this.YInt == other.YInt)
			return true;
		else 
			return false;
	}
	
	public boolean isParallel(Line other)
	{
		if (this.slope == other.slope || this.isVertical && other.isVertical)
			return true;
		else
			return false;
	}
}
