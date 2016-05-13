package chapter2;

import java.util.Arrays;

//import java.util.Arrays;

public class chapter2_1 {


        public static void main (String[] args) {

//          Myarray myarray = new Myarray();
          int[] array = new int[]{77, 32, 2, 26, 22, 21, 87, 45, 91, 30, 92, 42};        
          Myarray myarray = new Myarray(array);
          //myarray myarray = new Myarray(10);
        	
//            myarray.printOld();
            
        	long t0 = System.currentTimeMillis();
            int[] insertsort=myarray.insertionSort();
            printintarray("Insetion sort: ", insertsort);
            System.out.println(System.currentTimeMillis()-t0);
            
            int result=myarray.searhv(77);
            System.out.println(result);
            
            
            
    /*              
        System.out.println(System.currentTimeMillis());
        java.util.Date date = new java.util.Date();
        System.out.println("The elapsed time since Jan 1, 1970 is " +
                date.getTime() + " millseconds.");
        System.out.println(date.toString());
    */  
        }
        
        
        
    	
		public static void printintarray(String prefix, int[] array){
			System.out.println(prefix+Arrays.toString(array));
		}
		
}
