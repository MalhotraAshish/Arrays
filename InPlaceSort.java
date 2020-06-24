package Arrays_git;

import java.util.Arrays;

public class InPlaceSort {
	public static void main(String args[]) {
		int arr[] = { -12, 11, -13, -5, 6, -7, 5, -3, -6 };
		System.out.println(Arrays.toString(rearrange(arr)));
	}

	// In place insertion sort
	// Time complexity : O(n^2)
	// Space complexity : O(1)
	private static int[] rearrange(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > temp) {

				arr[j + 1] = arr[j];
				j--;

				arr[j + 1] = temp;
			}
		}
		return arr;
	}
	
	//In place merge sort
	//Time Complexity : O(nlogn)
	//Space Complexity : O(1)
}
