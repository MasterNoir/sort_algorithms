package functions;

public class functions {
	
	public static boolean compare(double left, double right, boolean ascending){
		
		if (ascending){
			if(left <= right) return true;
			else return false;
		}else{
			if(left < right) return false;
			else return true;
		}
		
	}
}
