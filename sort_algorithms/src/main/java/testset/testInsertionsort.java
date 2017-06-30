package testset;

import de.masternoir.sort_algorithms.bubblesort.bubblesort;
import functions.createRandomArray;
import insertionsort.insertionsort;

public class testInsertionsort {
	
public static void main(String[] args) {
		
		long timestamp;
		
		double[] arr;
		double[] result;
		int counter = 0;
		
		for(int i = 10; i <= 100000; i=2*i){
			counter++;
			arr = createRandomArray.getArray(i, 0.0, 100.0);
			
			timestamp = System.currentTimeMillis();
			
			result = insertionsort.insertionsort(arr, true);
			
			System.out.println("--" + counter + "--  " + (System.currentTimeMillis()-timestamp));
		}
		System.out.println("finished");
	}
}
