package Arrays;

public class SelectionSorting {

	static  void SelectionSort(int[] InputArray) {
		// Assuming

		int len = InputArray.length;// 5

		for (int i = 0; i < len; i++) {
			int min = i; // Assuming min is the least value at Index i
			for (int j = i + 1; j < len; j++) {
				if (InputArray[j] < InputArray[min]) {
					min = j;
				}

			}
			// Swapping Minimum element
			int temp = InputArray[min];
			InputArray[min] = InputArray[i];
			InputArray[i] = temp;
		}

	}

	public static void main(String[] args) {
		int[] array = { 3, 16, -2, -4, 0 };
		SelectionSort(array);
		System.out.println("Elements after selection sorting is ");

		for (int elm : array) {
			System.out.print(elm + " ");
		}
	}

}
