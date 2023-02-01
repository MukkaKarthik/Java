package Arrays;

public class BinarySearch {

	static int BinarySearching(int left, int right, int InputElement, int[] InputArray) {
		if (right >= left) {
			int mid = left + (right - left) / 2;
			if (InputArray[mid] == InputElement)// If element is present at the middle
			{
				return mid;
			}
			if (InputArray[mid] > InputElement)// Element is present on the left side of middle index element
			{
				return BinarySearching(left, mid - 1, InputElement, InputArray);
			}

			// Lastly element is present on the right side of middle index element

			return BinarySearching(mid + 1, right, InputElement, InputArray);
		}

		return -1;

	}

	public static void main(String[] args) {
		// Array should be sorted first
		int[] array = { -3, -1, 0, 45, 67 };
		int ElementGiven = 45;
		System.out.println("Given element is " + ElementGiven);
		int r = array.length - 1;

		int ReturnElement = BinarySearch.BinarySearching(0, r, ElementGiven, array);

		if (ReturnElement != -1) {
			System.out.println("Element given " + ElementGiven + " is found at " + ReturnElement + " index");
		} else {
			System.out.println("Given Element" + ElementGiven + "not found in array ");
		}

	}
}
