package arraydeque;

class Tester2 {

	public static int searchElement(int[] elements, int elementToBeSearched) {

		boolean flag = false;
		int counter = 0;
		for (int i = 0; i < elements.length; i++) {
			++counter;
			if (elementToBeSearched == elements[i]) {
				flag = true;
				
				break;
			}
		}
		if (flag == false) {
			return -1;
		}
		return counter;
	}

	public static void main(String[] args) {
		int[] elements = { 76, 24, 78, 98, 1 };
		int elementToBeSearched = 12;

		int numberOfIterations = searchElement(elements, elementToBeSearched);

		if (numberOfIterations == -1)
			System.out.println("Element not found!");
		else
			System.out.println(
					"Element found! Number of iterations required to find the element : " + numberOfIterations);
	}

}
