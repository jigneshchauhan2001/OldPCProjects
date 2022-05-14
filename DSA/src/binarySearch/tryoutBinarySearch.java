package binarySearch;

public class tryoutBinarySearch {

	
	
	// WORKS FOR SORTED DATA ONLY
	public static void main(String[] args) {
		int[] myarr = {45, 50, 55, 60, 65, 70, 75};
		
		// 60 
		
		int low = 0;
		int high = myarr.length-1;   // 6,   length gives 7
				
		while (low <= high) {
			int med = (low + high) / 2;
			
			if (myarr[med] == 65) {
				System.out.println(med + " position");
				break;
			}
			
			// no need to check for med again, so give (med+1) to low and give give (med-1) to high.
			if (myarr[med] <= 65) {
				low = med + 1;
			}
			else {
				high = med-1;
			}
			
		}
		
	}
}
