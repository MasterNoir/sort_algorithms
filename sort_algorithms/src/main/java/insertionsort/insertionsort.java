package insertionsort;

import functions.functions;

public class insertionsort {
	
	/**
	 * Stabiles Sortierverfahren. Effizient bei kleinen oder bereits teilweise
	 * sortierten Eingabemengen.
	 * @param list
	 * @return
	 */
	public static double[] insertionsort(double[] list, boolean ascending){
		
		double[] sortedList = list;
		int pos;
		boolean cont;
		double switchPos;
		
		if(list.length < 2){
			return list;
		}
		
		for(int i = 1; i < sortedList.length; i++){
			pos = i;
			
			do{
				cont = false;
				if(!functions.compare(sortedList[pos-1], sortedList[pos], ascending)){
					switchPos = sortedList[pos];
					sortedList[pos] = sortedList[pos-1];
					sortedList[pos-1] = switchPos;
					pos = pos-1;
					if(pos > 0){
						cont = true;
					}else{
						cont = false;
					}
				}
			}while(cont);
		}
		
		return sortedList;
	}
}
