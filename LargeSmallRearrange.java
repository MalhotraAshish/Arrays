package Arrays_git;

import java.util.Arrays;

public class LargeSmallRearrange {
	public static void main(String args[]) {
		int arr[] = { 5, 8, 1, 4, 2, 9, 3, 7, 6 };
		// System.out.println(Arrays.toString(rearrangeBruteForce(arr)));
		System.out.println(Arrays.toString(rearrangeOptimized(arr)));
	}

	// Time Complexity = O(n^2)
	// Space Complexity = O(1)
	private static int[] rearrangeBruteForce(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int small = Integer.MAX_VALUE, large = Integer.MIN_VALUE;
			for (int j = i; j < arr.length; j++) {
				if ((i % 2) != 0) {
					if (arr[j] > large) {
						large = arr[j];
						arr[j] = arr[i];
						arr[i] = large;
					}
				} else {
					if (arr[j] < small) {
						small = arr[j];
						arr[j] = arr[i];
						arr[i] = small;
					}
				}
			}
			if ((i % 2) != 0) {
				arr[i] = large;
			} else {
				arr[i] = small;
			}
		}
		return arr;
	}

	// Time Complexity = O(nlogn)
	// Space Complexity = O(n)
	private static int[] rearrangeOptimized(int[] arr) {
		Arrays.sort(arr);
		boolean first = true;
		int new_arr[] = new int[arr.length];
		int i = 0, j = arr.length-1, k = 0;
		while(k <= arr.length-1) {
			if (first) {
				new_arr[k] = arr[i];
				first = false;
				i++;
			}else {
				new_arr[k] = arr[j];
				first = true;
				j--;
			}
			k++;
		}
		return new_arr;
	}

}
