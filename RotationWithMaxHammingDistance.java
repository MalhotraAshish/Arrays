package Arrays_git;

import java.util.Arrays;

public class RotationWithMaxHammingDistance {
	
	public static int rotationAndHamming(int arr[]) {
		int max_distance = Integer.MIN_VALUE;
		int distance = 0;
		int new_array[] = new int[arr.length];
		int original_arr[] = Arrays.copyOf(arr, arr.length);
		for(int i = 0; i<arr.length; i++) {
			new_array = rotate(original_arr, i+1);
			distance = hammingDistance(arr, new_array);
			max_distance = Math.max(distance, max_distance);
		}
		return max_distance;
	}
	
	private static int hammingDistance(int[] arr, int[] new_arr) {
		int count = 0;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] != new_arr[i]) {
				count++;
			}
		}
		return count;
	}

	private static int[] rotate(int[] arr, int d) {
		arr = ArrayRotation.reverseArray(arr,0,d-1);
		arr = ArrayRotation.reverseArray(arr,d,arr.length-1);
		arr = ArrayRotation.reverseArray(arr,0,arr.length-1);
		return arr;
	}

	public static void main(String args[]) {
		int arr[] = {2, 4, 6, 8};  
	    System.out.print(rotationAndHamming(arr));
	}
}
