package searching;

public class Searching {

	public static void main(String[] args) {

		System.out.println("LINEAR SEARCH");
		int array1[] = { 24, 45, 67, 89, 9, 11 };
		int value = 67;
		int result = linearSearch(array1, array1.length - 1, value);
		if (result == -1) {
			System.out.println("Element is not present in array");
		} else {
			System.out.println("Element is present in array at index :" + result);
		}

		System.out.println("BINARY SEARCH");
		int array2[] = { 11, 24, 38, 76, 100 };
		int x = 100;
		int r = binarySearch(array2, x);
		if (r == -1) {
			System.out.println("Element is not present in array");

		} else {
			System.out.println("Element is present in array at index : " + r);
		}

	}

	public static int linearSearch(int array[], int k, int value) {

		int i;
		for (i = 0; i < k; i++) {
			if (array[i] == value) {
				return i;
			}
		}
		return -1;

	}

	public static int binarySearch(int array[], int value) {

		int mid;
		int start = 0;
		int end = array.length - 1;
		while (start <= end) {
			mid = (start + end) / 2;
			if (array[mid] == value)
				return mid;
			if (array[mid] < value) {
				start = mid + 1;
			} else
				end = mid - 1;
		}
		return -1;

	}

}
