package impProg;

public class minMaxArray {
	
	public static int[] getMaxMin(int arr[], int low, int high) { 
	  
		int[] newarr = new int[2];
			
		int max = 0;
		int min = Integer.MAX_VALUE;
		for (int i = low; i <high+1; i++) {
			
			if (arr[i] > max) {
				max = arr[i];	
			}
			if (arr[i] < min) {
				min = arr[i];	
			}
		}
		newarr[0]=max;
		newarr[1]=min;
		return newarr;
		
	} 
	  
	public static void main(String args[]) { 
	   // int arr[] = {10, 10, 1, 1000000, 100000, 0, 4};

		 int arr[] = {2, 3,1,0,0,18,19,1000,9,7,45,15};
	    int[] maxMin = getMaxMin(arr, 0, arr.length - 1);
	    
	      System.out.println("Minimum value is "+ maxMin[1]); 
	 	  System.out.println("Maximum value is "+ maxMin[0]); 
	} 
}