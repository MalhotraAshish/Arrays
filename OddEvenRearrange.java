package Arrays_git;

import java.util.Arrays;

public class OddEvenRearrange {
	
	public static void main(String args[]) {
		int arr[] = {2, 3, 4, 5};
		System.out.println(Arrays.toString(rearrange(arr)));
	}

	private static int[] rearrange(int[] arr) {
		Arrays.sort(arr);
		int new_arr[] = new int[arr.length];
		int length = arr.length;
		int even  = length/2;
		int odd = length - even;
		int j = odd-1;
		System.out.println("odd position  = " + j + " and even  = " + even);
		for(int i = 0; i< length; i = i+2) {
			new_arr[i] = arr[j];
			j--;
		}
		j = odd;
		for(int i = 1; i<length; i = i+2) {
			new_arr[i] = arr[j];
			j++;
		}
		return new_arr;
	}

}
