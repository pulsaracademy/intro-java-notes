package homework04;

import java.util.Arrays;

public class ArraysPractice {

	public static void main(String[] args) {
		// test stuff here 

	}

	// Problem 1
	public static int lastIndexOf(int[] arr, int regex) {
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] == regex) {
				return i;
			}
		}

		return -1;

	}

	// Problem 2
	public static int range(int[] arr) {
		int max = arr[0];
		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			// find maximum
			if (arr[i] > max) {
				max = arr[i];
			}
			// find minimum
			if (arr[i] < min) {
				min = arr[i];
			}
		}

		int range = max - min + 1;
		return range;

	}

	// Problem 3
	public static boolean isSorted(double[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i + 1] < arr[i]) {
				return false;
			}

		}
		return true;
	}

	// Problem 7
	public static int[] append(int[] a, int[] b) {
		int length = a.length + b.length;
		int[] combined = new int[length];

		for (int i = 0; i < combined.length; i++) {
			if (i < a.length) {
				combined[i] = a[i];
			} else {
				// account for transformation
				combined[i] = b[i - a.length];
			}
		}

		return combined;

	}

	

}
