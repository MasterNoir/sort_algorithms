package de.masternoir.sort_algorithms;

import de.masternoir.sort_algorithms.bubblesort.*;
import functions.createRandomArray;
import insertionsort.insertionsort;

public class Driver {

	public static void main(String[] args) {
		
		long timestamp;
		
		double[] arr;
		double[] result;
		int counter = 0;
		
		for(int i = 10; i <= 10; i=2*i){
			counter++;
			arr = createRandomArray.getArray(i, 0.0, 100.0);
			
			timestamp = System.currentTimeMillis();
			
			result = insertionsort.insertionsort(arr, true);
			for(int j = 0; j < result.length; j++){
				System.out.printf("|" + "%.2f" + "|", result[j]);
			}
			System.out.println("");
			
			System.out.println("--" + counter + "--  " + (System.currentTimeMillis()-timestamp));
		}
		System.out.println("finished");
	}

}
