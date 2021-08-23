package com.linecomparison;

import java.util.*;

public class UC1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x1,y1,x2,y2;
		double length;
		Scanner reader = new Scanner(System.in);
		System.out.println("Welcome to Line Comparison Computation Program");
	    System.out.println("Enter the coordinates of Line in the form of (x1,y1) and (x2,y2)");
	    x1=reader.nextInt();
	    y1=reader.nextInt();
	    x2=reader.nextInt();
	    y2=reader.nextInt();
		length = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
	    System.out.println("The length of the line is:"+String.format("%.4f",length));
		
	}

}

