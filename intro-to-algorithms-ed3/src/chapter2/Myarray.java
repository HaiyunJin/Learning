package chapter2;

import java.util.Arrays;


public class Myarray{
	// Length of the array
    public int length;
    public int[] myarray;
    public int[] sortarray;
    private final int range=10000;
    
    // if no array are given, randomly generate one.
    Myarray() {
        int n = (int)(Math.random()* 100);
        length =n;
        System.out.println("length "+length);
        myarray = new int[n];   
        for ( int i =0 ; i < n ; i++ ){
            myarray[i] = (int)(Math.random()*range);
        }
        System.out.println(Arrays.toString(myarray));
        System.out.println("Construct: "+myarray.length);
    }
    // or, generate a string with given number of items
    Myarray(int number){
    	myarray = new int[number];
    	length = number;
        for ( int i =0 ; i < number ; i++ ){
            myarray[i] = (int)(Math.random()*range);
        }
    }
    // or, use the user's array
    Myarray(int[] newarray){
    	length = newarray.length;
        myarray = Arrays.copyOf(newarray, length);
    }

    void printOld(){
        System.out.println("Old Array: "+Arrays.toString(myarray));
    }
    
    void printSorted(){
        System.out.println("Sort Array:"+Arrays.toString(sortarray));
    }
    
    
    int searhv(int v){
    	for (int i = 0 ; i < length; i++){
    		if (myarray[i] == v){
    			return i;
    		}
    	}
    	return  100000;
//    	return 100;
    }
    
    

    int[] insertionSort(){
//    void insertionSort()
        System.out.println("lenght of array: "+myarray.length);
        if  (myarray.length > 1){
            int key;
            int j;
            sortarray = Arrays.copyOf(myarray, myarray.length);
            for (int i = 1; i < sortarray.length; i++) {
                key = sortarray[i];
                j = i - 1;
//                while (j>=0 && sortarray[j] > key ) // increasing
                while (j>=0 && sortarray[j] < key ){	//decreasing
                    sortarray[j+1] = sortarray[j];
                    j = j - 1;
                }
                sortarray[j+1] = key;
            }
            return sortarray;
        }
        return myarray;
    }

}
    
  