package basicArrays;

public class MaxSumOnlyRotation {

	// brute force
	// Time Complexity: O(n^2)
	public static int maxSum(int arr[]) {
		int max_sum = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			int rotated_arr[] = rotate(arr);
			int sum = findSum(rotated_arr);
			if(sum > max_sum) {
				max_sum = sum;
			}
		}
		return max_sum;
	}

	private static int findSum(int[] rotated_arr) {
		int sum = 0;
		for(int i = 0; i<rotated_arr.length; i++) {
			sum = sum + (i*rotated_arr[i]);
		}
		return sum;
	}

	private static int[] rotate(int arr[]) {
		int temp = arr[0];
		for(int i = 1; i<arr.length; i++) {
			arr[i-1] = arr[i];
		}
		arr[arr.length-1]=temp;
		return arr;
	}

	public static void main(String args[]) {
		int arr[] = {10, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println(maxSum(arr));
	}

}
