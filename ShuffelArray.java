package Arrays_git;

import java.util.Arrays;
import java.util.Random;

public class ShuffelArray {

	public static void main(String args[]) {
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
		System.out.println(Arrays.toString(rearrange(arr)));
	}

	private static int[] rearrange(int[] arr) {
		Random r = new Random();
		for(int i = arr.length-1; i>0; i--) {
			int pick = r.nextInt(i+1);
			int temp = arr[i];
			arr[i] = arr[pick];
			arr[pick] = temp;
		}
		return arr;
	}
}
