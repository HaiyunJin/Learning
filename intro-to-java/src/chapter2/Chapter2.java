package chapter2;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Chapter2{
	public final static double PI = 3.1415926;
	public static void main (String[] args){
		// list 2.1 
		//computeArea();
		// list 2.2
		//computeinput();
		// list 2.3 aver
		//computeAverage();
		// list 2.4 convert seconds
		//displayTime();
		// list 2.5 fahrenheitToCelsius
		//fahrenheitToCelsius();
		// list 2.6 show current time
		//showCurrentTime();
		// list 2.8 compute loan
		//computeLoan();
		// list 2.9
		displayUnicode();
	}
	
	// list 2.9
	public static void displayUnicode(){
		JOptionPane.showMessageDialog(null, "\u6B22\u8FCE \u03b1 \u03b2 \u03b3",
				"\u6B22\u8FCE Welcome",
				JOptionPane.INFORMATION_MESSAGE);
	}
	
	// list 2.8 compute loan
	public static void computeLoan(){
		Scanner input = new Scanner(System.in);
		// yearly interest
		System.out.print("Enter yearly interest rate, for example 8.25: ");
		double annualInterestRate = input.nextDouble();
		// monthly interest
		double monthlyInterestRate = annualInterestRate/1200;
		System.out.print("Enter years as an integer number, for example 5: ");
		int numberOfYears = input.nextInt();
		// Enter loan amount
		System.out.print("Enter the total loan amount, for example 190.04: ");
		double loanAmount = input.nextDouble();
		//calculate monthly payment
		double monthlyPayment = loanAmount * monthlyInterestRate / (
				1-1/Math.pow(1+monthlyInterestRate, numberOfYears*12));
		//display
		System.out.println("Your monthly payment is: " + (int) monthlyPayment*100/100.0);
	}
	
	// list 2.6
	public static void showCurrentTime(){
		long totalMilliseconds = System.currentTimeMillis();
		long totalSeconds = totalMilliseconds/1000;
		long currentSecond = totalSeconds%60;
		long totalMinutes = totalSeconds/60; // round to integer
		long currentMinute = totalMinutes%60;
		long totalHours = totalMinutes/60;
		
		long timeZone = -5; 				// time zone correction
		totalHours += timeZone;				// apply time zone correction	
		long currentHour = totalHours%24;
		
		System.out.println("Current time: " + currentHour +":"+currentMinute+
				":"+currentSecond + " CDT");
	}
	
	// list 2.5 
	public static void fahrenheitToCelsius(){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a tempterature in F: ");
		double fahrenheit = input.nextDouble();
		// calculate
		double celsius = (fahrenheit -32.0)*5.0/9.0;
		System.out.println(fahrenheit + " F is " + celsius + " C ");
	}
	
	// list 2.4 display time
	public static void displayTime(){
		Scanner input = new Scanner(System.in);
		// prompt user input
		System.out.print("Enter an integer for seconds: ");
		int seconds = input.nextInt();
		// calculate 
		int hours = seconds/3600;
		int minutes = seconds%3600/60 ;
		int remainingSeconds = seconds%60;
		System.out.println(seconds + " seconds is "+hours + " hours " +
				minutes +" minutes and " + remainingSeconds + " seconds" );
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
