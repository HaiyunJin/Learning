package chapter2;

import java.util.Scanner;

public class Chapter2{
	public final static double PI = 3.1415926;
	public static void main (String[] args){
		// list 2.1 
		computeArea();
		// list 2.2
		computeinput();
		// list 2.3 aver
		computeAverage();
	}
	
	
	// list 2.3 comput average
	public static void computeAverage(){
		//scanner
		Scanner input = new Scanner(System.in);
		//ask numbers
		System.out.print("Enter three number: ");
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();
		// calc average
		double aver = (number1+number2+number3)/3.0;
		// print 
		System.out.println("The average of "+ number1+" "+number2+" "+number3+
				" is " + aver);
		
		
	}
	
	// list 2.2
	public static void computeinput(){
		// scanner
		Scanner input = new Scanner(System.in);
		// ask to input
		System.out.print("Enter a number for radius: ");
		double radius = input.nextDouble();
		// Step 2: Compute area
		double area = radius*radius*PI;
		// Step 3: Display area
		System.out.println("The area for the circle of radius " +
		radius + " is "+area);	
	}
	
	
	//list2.1
	public static void computeArea(){
		double radius;
		double area;
		// Step 1: read radius
		radius = 20;
		// Step 2: Compute area
		area = radius*radius*PI;
		// Step 3: Display area
		System.out.println("The area for the circle of radius " +
		radius + " is "+area);
	}
}
