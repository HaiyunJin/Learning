package chapter1;

public class Exercise1_1 {
	public static void main(String[] args){
		System.out.println("Welcome to Java");
		System.out.println("Welcome to Computer Science");
		System.out.println("Programing is fun");
		int a=1;
		int b=2;
		int c=3;
		
		// Exercise 1.3
		System.out.println(a);
		// Exercise 1.4
		System.out.println("    a  a^2  a^3");
		for (int i = 1; i <=4;i++){
			System.out.printf("%5d%5d%5d%n", i, (int) Math.pow(i, 2), (int) Math.pow(i, 3));			
		}
		// Exercise 1.7
		int n = 100000000;
		double result = 0;
		for (int i = 0 ; i <= n ; i++){
			result +=  Math.pow(-1, i)*1/(2*((double) i )+1.0) ;
		}
		result*=4;
		System.out.print(result);

		

	}
}
