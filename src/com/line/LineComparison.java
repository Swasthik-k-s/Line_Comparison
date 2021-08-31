package com.line;

public class LineComparison {

	public static void main(String[] args) {
		Line line1 = new Line();
		line1.UserInput();
		
		Line line2 = new Line();
		line2.UserInput();
		
		double distance1 = line1.Distance();
		double distance2 = line2.Distance();
		
		System.out.println("Length of Line 1 = " + distance1);
		System.out.println("Length of Line 2 = " + distance2);
		
		line1.Equals(distance1,distance2);
		line1.CompareTo(distance1,distance2);

	}

}
