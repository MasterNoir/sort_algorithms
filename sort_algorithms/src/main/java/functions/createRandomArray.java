package functions;

public class createRandomArray {
	
	public static double[] getArray(int length, double min, double max){
		
		double[] arr = new double[length];
		
		for(int i = 0; i < arr.length; i++){
			arr[i] = min + Math.random()*(max - min);
		}
		
		return arr;
	}
}
