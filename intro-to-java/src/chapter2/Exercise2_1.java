package chapter2;

import java.util.*;

public class Exercise2_1 {
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a degree in Celsius: ");
		int celsius = input.nextInt();
		
		double fahrenheit = (9.0 / 5.0) * (double) celsius + 32;
	
		System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
	}
	
}
