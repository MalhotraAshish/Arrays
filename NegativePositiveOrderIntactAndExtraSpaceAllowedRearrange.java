package Arrays_git;

import java.util.Arrays;

public class NegativePositiveOrderIntactAndExtraSpaceAllowedRearrange {
	public static void main(String args[]) {
		int arr[] = { -12, 11, -13, -5, 6, -7, 5, -3, -6 };
		System.out.println(Arrays.toString(rearrange(arr)));
	}

	private static int[] rearrange(int[] arr) {
		int low = 0, high = arr.length - 1;
		mergesort(arr, low, high);
		return arr;
	}

	private static void mergesort(int[] arr, int low, int high) {
		if (low < high) {
			int mid = (low + high) / 2;
			mergesort(arr, low, mid);
			mergesort(arr, mid + 1, high);
			merge(arr, low, mid, high);
		}
	}

	private static void merge(int[] arr, int low, int mid, int high) {

		int i , j , k , n1 = mid - low + 1, n2 = high - mid;
		int L[] = new int[n1];
		int R[] = new int[n2];

		/* Copy data to temp arrays L[] and R[] */
		for (i = 0; i < n1; i++)
			L[i] = arr[low + i];
		for (j = 0; j < n2; j++)
			R[j] = arr[mid + 1 + j];

		i = 0;
		j = 0;
		k = low;
		
		while (i < n1 && L[i] < 0)
			arr[k++] = L[i++];
		
		while (j < n2 && R[j] < 0)
			arr[k++] = R[j++];
		
		while (i < n1)
			arr[k++] = L[i++];
		
		while (j < n2)
			arr[k++] = R[j++];

	}
}
