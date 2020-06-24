package Arrays_git;

import java.util.Arrays;

//replace every element by multiplication of previous and next element
//in case of first element replace with multiplication of itself and next element
//in case of last element replace with multiplication of itself and prev element
public class MultiplyByPrevRearrange {

	public static void main(String args[]) {
		int arr[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		System.out.println(Arrays.toString(rearrange(arr)));
	}

	private static int[] rearrange(int[] arr) {
		int prev = arr[0];
		arr[0] = arr[0] * arr[1];
		for(int i = 1; i<arr.length-1; i++) {
			int cur = arr[i];
			arr[i] = arr[i+1] * prev;
			prev = cur;
		}
		arr[arr.length-1] = arr[arr.length-1] * prev;
		return arr;
	}
}
