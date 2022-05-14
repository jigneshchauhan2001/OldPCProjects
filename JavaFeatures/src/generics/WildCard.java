package generics;

public class WildCard {

	public <E> void printArray(Integer[] myinput)
	{
		for (int i = 0; i < myinput.length; i++) {
			System.out.println(myinput[i]);
		}
	}

		public static void main(String[] args) {

			Integer[] arrInteger = { 10, 20, 30, 40, 50, 60 };
			Character[] arrChar = { 'I', 'N', 'F', 'O', 'S', 'Y', 'S' };
			Double[] arrDouble = { 100.1, 200.1, 300.1, 400.1, 500.1, 600.1 };
			WildCard wc = new WildCard();
			wc.printArray(arrInteger);
			//wc.printArray(arrChar);
			//wc.printArray(arrDouble);
		}
	
	
}

