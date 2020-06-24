package Arrays_git;

import java.util.Arrays;

public class DoubleFirstElementRearrange {
	public static void main(String args[]) {
		int arr[] = { 0, 2, 2, 2, 0, 6, 6, 0, 0, 8 };
		System.out.println(Arrays.toString(rearrange(arr)));
	}

	private static int[] rearrange(int[] arr) {
		arr = doubleFirstElement(arr);
		arr = nonZerosTogether(arr);
		return arr;
	}

	private static int[] nonZerosTogether(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++)
			if (arr[i] != 0)
				arr[count++] = arr[i];
		while (count < arr.length) 
            arr[count++] = 0; 
		return arr;
	}

	private static int[] doubleFirstElement(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				arr[i] = arr[i] * 2;
				arr[i + 1] = 0;
			}
		}
		return arr;
	}
}
