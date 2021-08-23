package com.linecomparison;

import java.util.*;

public class UC2 {

	public static void main(String[] args) {
		int x1,y1,x2,y2,a1,b1,a2,b2;
		double length1,length2;
		Scanner reader = new Scanner(System.in);
		System.out.println("Welcome to Line Comparison Computation Program");
	    System.out.println("Enter the coordinates of Line 1 in the form of (x1,y1) and (x2,y2)");
	    x1=reader.nextInt();
	    y1=reader.nextInt();
	    x2=reader.nextInt();
	    y2=reader.nextInt();
	    System.out.println("Enter the coordinates of Line 2 in the form of (x1,y1) and (x2,y2)");
	    a1=reader.nextInt();
	    b1=reader.nextInt();
	    a2=reader.nextInt();
	    b2=reader.nextInt();
		length1 = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		length2 = Math.sqrt((a2-a1)*(a2-a1)+(b2-b1)*(b2-b1));
		
		System.out.println("The length of the Line 1 is:"+String.format("%.4f",length1));
		System.out.println("The length of the Line 2 is:"+String.format("%.4f",length2));
		
		if((String.valueOf(length1)).equals(String.valueOf(length2))) {
			System.out.println("Two Lines are Equal");
		} else {
			System.out.println("Two Lines are Not Equal");
		}
	    
		
	}

}


