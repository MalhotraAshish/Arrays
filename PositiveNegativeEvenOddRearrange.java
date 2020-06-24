package Arrays_git;

import java.util.Arrays;

public class PositiveNegativeEvenOddRearrange {
	public static void main(String args[]) {
		int arr[] = { 1, -3, 5, 6, -3, 6, 7, -4, 9, 10 };
		System.out.println(Arrays.toString(rearrange(arr)));
	}

	private static int[] rearrange(int[] arr) {
		int pos_index = 0, neg_index = 1, temp;
		while (true) {
			while (pos_index < arr.length && arr[pos_index] > 0) {
				//System.out.println("postive index = " + pos_index + " value = " + arr[pos_index]);
				pos_index = pos_index + 2;
			}
			while (neg_index < arr.length && arr[neg_index] < 0) {
				//System.out.println("negative index = " + neg_index + " value = " + arr[neg_index]);
				neg_index = neg_index + 2;
			}
			if (pos_index < arr.length && neg_index < arr.length) {
				temp = arr[pos_index];
				arr[pos_index] = arr[neg_index];
				arr[neg_index] = temp;
			} else {
				break;
			}
		}
		return arr;
	}
}
