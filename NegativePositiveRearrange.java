package Arrays_git;

import java.util.Arrays;

public class NegativePositiveRearrange {
	public static void main(String args[]) {
		int arr[] = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
		System.out.println(Arrays.toString(rearrange(arr)));
	}

	private static int[] rearrange(int[] arr) {
		int pivot = 0;
		int i = 0, j = arr.length - 1;
		for (i = 0; i < j; i++) {
			if (arr[i] > pivot) {
				for (j = arr.length - 1; j >= i; j--) {
					if(arr[j] < pivot) {
						int temp = arr[j];
						arr[j] = arr[i];
						arr[i] = temp;
					}
				}
			}
		}
		for(i = 0; i<arr.length; i++) {
			if(arr[i]>=0) {
				j = i;
				break;
			}
		}
		for(i = 0; i<arr.length&&j<arr.length; i = i+2, j = j+1) {
			int temp =  arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		return arr;
	}
}
