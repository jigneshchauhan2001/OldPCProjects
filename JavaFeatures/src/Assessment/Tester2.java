package Assessment;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Tester2 {

	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		int size =scanner.nextInt();
		
		int[] arr = new int[size];
		
		for (int i = 0; i < size; i++) {
			arr[i] = scanner.nextInt();
		}
		scanner.close();
		
		
		List list = new LinkedList();
		
		char[] charArr = new char[size];
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 65  && arr[i] <= 90) {
				
				charArr[i] =  (char) arr[i];
				list.add(charArr[i]);
			}
			else if (arr[i] >= 97  &&  arr[i] <= 122)
			{
				charArr[i] =  (char) arr[i];
				list.add(charArr[i]);
			}
			else { 
				list.add(-1);
			}
		}
		System.out.println(list);
	}
}
