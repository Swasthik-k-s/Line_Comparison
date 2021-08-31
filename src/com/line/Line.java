package com.line;

import java.util.Scanner;

public class Line {
	int x1,x2,y1,y2;
	double distance;

	public void UserInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the coordinates of the Line in the form of (x1,y1) and (x2,y2)");
		x1=scanner.nextInt();
		y1=scanner.nextInt();
		x2=scanner.nextInt();
		y2=scanner.nextInt();
	}

	public double Distance() {
		distance = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		return distance;
	}

	public void Equals(Double distance1, Double distance2) {
		if(distance1.equals(distance2)) {
			System.out.println("Two Lines are Equal");
		} else {
			System.out.println("Two Lines are not Equal");
		}
	}

	public void CompareTo(Double distance1, Double distance2) {
		if(distance1.compareTo(distance2) > 0){
			System.out.println("Line 1 is greater than Line 2");
		} else if(distance1.compareTo(distance2) < 0){
			System.out.println("Line 2 is greater than Line 1");
		}
	}
}
