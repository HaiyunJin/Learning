package chapter2;

import java.util.*;

public class Exercise2_8 {
	public static void main(String[] args){

		final double PI = 3.141592654 ;
			
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an ASCII coe: ");
		short code  = input.nextShort();
		char c = (char) code;
	
		System.out.println("The charater is for the ACSII code " + code + " is " + c);
	}
	
}
