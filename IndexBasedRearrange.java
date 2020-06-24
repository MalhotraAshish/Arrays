package Arrays_git;

import java.util.Arrays;

public class IndexBasedRearrange {

	public static void main(String[] args) {
		int arr[] = { 50, 40, 70, 60, 90 };
		int index[] = { 3, 0, 4, 1, 2 };
		System.out.println(Arrays.toString(rearrange(arr, index)));
	}

	private static int[] rearrange(int[] arr, int[] index) {
		for (int i = 0; i < arr.length; i++) {
			while (i != index[i]) {
				int oldTargetI = index[index[i]];
				int oldTargetE = arr[index[i]];
				arr[index[i]] = arr[i]; 
                index[index[i]] = index[i]; 
                index[i] = oldTargetI; 
                arr[i]   = oldTargetE; 
			}
		}
		return arr;
	}

}
