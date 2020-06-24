package Arrays_git;

import java.util.Arrays;

public class ArrayIndexandValueRearrange {

	public static void main(String args[]) {
		int arr[] = {0, 1, 2, 3};
		System.out.println(Arrays.toString(rearrange(arr)));
	}

	private static int[] rearrange(int[] arr) {
		int new_arr[] = new int[arr.length];
		for(int i = 0; i<arr.length; i++) {
			new_arr[arr[i]] = i;
		}
		return new_arr;
	}
	
}
