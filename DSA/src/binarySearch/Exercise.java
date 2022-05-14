package binarySearch;

import javax.print.attribute.standard.Media;

public class Exercise {    
	
	    public static int iterations=0;
		
		public static int searchElement(int elements[],int low,int high,int elementToBeSearched)  {


			while(low<= high) { 
				int mid = (low + high) / 2;
				++iterations;
				
				if (elements[mid] == elementToBeSearched) {
					return mid;
				}
				
				if (elements[mid] <= elementToBeSearched) {
					low = mid + 1;
				} else {
					high = mid -1;
				}			
			}
			return -1;	
		}
		
		public static void main(String[] args) {
		    int[] elements = { 1, 2, 3, 4, 5};
			int elementToBeSearched = 1;
			
			int indexPosition=searchElement(elements, 0, elements.length-1, elementToBeSearched);
			
			if (indexPosition == -1)
				System.out.println("Element not found!");
			else
				System.out.println("Element found at index position " + indexPosition+"!");
			
			System.out.println("Number of iterations: "+iterations);
		}

		
	
}
