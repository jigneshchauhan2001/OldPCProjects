package bubblesort;

public class BubbleSort {

	
	
	
	 public static void main(String[] args) {
		 int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
		 
		 // arr.length -- gives 7, hence arr.length-1 => gives us 6
		 // if array has 7 elements - outer loop runs for the 6 times.
		 // because comparision between all elemetns will be 6  from starting.

		for (int i = 0; i < arr.length-1; i++) {
			
			// inner loop run for the arr.length-1-i 
			// if runs for arr.length-1 times -- there will be no issue, but it is not required.
			// But after 1 vompletion of outside loop last elemet will be greatest. 
			// and so on for 2nd and third last element will become greate in desc order. 
			// So minus i from arr.length-1
			
			for (int j = 0; j < arr.length-1 -i; j++) {
				int temp = arr[j];
				if (arr[j] > arr[j+1]) {
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		for (int i : arr) {
			System.out.println(i);
		}
		 
		 
	}
}



