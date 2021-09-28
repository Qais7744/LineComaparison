package javalinecomparison;

public class LineComparison {
		// Function to calculate distance
	static double distance (int x1, int y1, int x2, int y2)
	{
		// Calculating distance
		double distance;
		distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		return distance;
	}
		public static void main(String[] args)
		{
			LineComparison linecomparison = new LineComparison();
			Double lineOne = linecomparison.distance(4, 6, 8, 5);
			Double lineTwo = linecomparison.distance(1, 2, 3, 4);
		
		if (Double.compare(lineOne, lineTwo) == 0)
			System.out.println("Both the lines are Equal");
		else if (Double.compare(lineOne, lineTwo) < 0)
			System.out.println("lineTwo is greater than lineOne");
		else
			System.out.println("lineOne is Greater than lineTwo");
		}
	
}
