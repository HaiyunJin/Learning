package chapter2;

import java.util.*;

public class Exercise2_2 {
	public static void main(String[] args){

		final double PI = 3.141592654 ;
			
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the radius and length of a cylinder: ");
		Double radius = input.nextDouble();
		Double length = input.nextDouble();

		
		Double area = radius * radius * PI;
		Double volume = area * length;
	
		System.out.println("The area is " +  (int)( area*10000)/10000.0000);
		System.out.println("The volume is " + (int) (volume*10)/10.0);
	}
	
}
