package Arrays_git;

import java.util.Arrays;

public class ZeroAtEndRearrange {

	public static void main(String[] args) {
		int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
		System.out.println(Arrays.toString(rearrange(arr)));

	}

	private static int[] rearrange(int[] arr) {
		 int j = 0;
		 for(int i = 0; i<arr.length; i++) {
			 if(arr[i] != 0) {
				 arr[j] = arr[i];
				 j++;
			 }
		 }
		 for(int i = j; i<arr.length; i++) {
			 arr[i] = 0;
		 }
		return arr;
	}

}
