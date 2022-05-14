package Assessment;

public class SwapEmployee {

	public <T> void swap(T[] a, int i, int j) {
		T temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		for (T t : a) {
			System.out.print(t+ "\t");
		}

	}
	
	public static void main(String[] args) {
		
		String aString = "Jignseh Chauhan";
		String newString = aString.replaceAll(" ", "");
		System.out.println(newString);
		
		
		
	}
	
}
