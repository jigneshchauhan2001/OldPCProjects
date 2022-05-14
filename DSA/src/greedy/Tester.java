package greedy;


// INCOMPLETE
public class Tester {

	public static int findMaxActivities(int start[], int finish[]) {

		int count = 0;
			
		for (int i = 0; i < start.length - 1; i++) {
										
				if (start[i] <= finish[i] && finish[i] <= start[i+1] ) {
					count++;
				}
				
				if (start[i+1] <= finish[i+1] ) {
				count++;
			}
								
		}		
		return count;
	}

	public static void main(String[] args) {
		int start[] = { 1, 3, 0, 5, 9, 8 };
		int finish[] = { 3, 5, 8, 10, 12, 13 };
		
		
		System.out.println("Maximum number of activities: " + findMaxActivities(start, finish));
	}
	
	
	
}
