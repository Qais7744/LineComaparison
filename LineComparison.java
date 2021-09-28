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
			double value = linecomparison.distance(4, 5, 6, 7);
			System.out.println("calculate distance between two points : " +value);
		}
	
}
