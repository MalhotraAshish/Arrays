package Arrays_git;

public class ArrayRotation {

	// Input: arr[] = {1, 2, 3, 4, 5}
	// Output: arr[] = {3, 4, 5, 1, 2}

	// time complexity = O(n*d)
	// space complexity = O(1)
	public static int[] brutForce(int[] arr, int d) {
		for (int i = 0; i < d; i++) {
			int first = arr[0];
			for (int j = 1; j < arr.length; j++) {
				arr[j - 1] = arr[j];
			}
			arr[arr.length - 1] = first;
		}
		return arr;
	}

	// time complexity = O(n)
	// space complexity = O(1)
	public static int[] jugglingAlgorithm(int[] arr, int d) {
		int n = arr.length;
		int k = -1, temp, j, no_of_sets;
		no_of_sets = GCD(n, d);
		for (int i = 0; i < no_of_sets; i++) {
			j = i;
			temp = arr[i];
			while (true) {
				k = (j + d) % n;
				if (k == i) {
					break;
				}
				arr[j] = arr[k];
				j = k;
			}
			arr[j] = temp;
		}
		return arr;
	}

	// time complexity = O(n)
	// space complexity = O(1)
	public static int[] reversalAlgorithm(int arr[], int d) {
		int n = arr.length;
		arr = reverseArray(arr, 0, d - 1);
		arr = reverseArray(arr, d, n - 1);
		arr = reverseArray(arr, 0, n - 1);
		return arr;
	}

	public static int[] reverseArray(int[] arr, int start, int end) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		return arr;
	}

	private static int GCD(int n, int d) {
		if (d == 0) {
			return n;
		} else {
			return GCD(d, n % d);
		}
	}

	
	//TimeComplexity of rotation: O(1)
	//SpaceComplexity: O(1)
	public static void efficientArrayApproch(int arr[], int k) {
		for(int i = k; i<k+arr.length; i++) {
			System.out.print(arr[i%arr.length]);
		}
	}
	
	public static void main(String args[]) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println(System.currentTimeMillis() + " for brute force start");
		arr = brutForce(arr, 2);
		System.out.println(System.currentTimeMillis() + " for brute force end");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
		int arr_juggling_alogithm[] = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println(System.currentTimeMillis() + " for juggling start");
		arr_juggling_alogithm = jugglingAlgorithm(arr_juggling_alogithm, 2);
		System.out.println(System.currentTimeMillis() + " for juggling end");
		for (int i = 0; i < arr_juggling_alogithm.length; i++) {
			System.out.print(arr_juggling_alogithm[i] + " ");
		}
		System.out.println("");
		int arr_reverseal_algorithm[] = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println(System.currentTimeMillis() + " for reversal start");
		arr_reverseal_algorithm = reversalAlgorithm(arr_reverseal_algorithm, 2);
		System.out.println(System.currentTimeMillis() + " for reversal end");
		for (int i = 0; i < arr_reverseal_algorithm.length; i++) {
			System.out.print(arr_reverseal_algorithm[i] + " ");
		}
		System.out.println("");
		int arr_efficient_algorithm[] = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println(System.currentTimeMillis() + " for effecient start");
		efficientArrayApproch(arr_efficient_algorithm, 10);
		System.out.println("");
		System.out.println(System.currentTimeMillis() + " for effecient end");
	}

}
