package Arrays_git;

public class CyclicRotationOfArray {
	
	//Input:  arr[] = {1, 2, 3, 4, 5}
	//Output: arr[] = {5, 1, 2, 3, 4}
	
	//time complexity  : O(n*d)
	//space complexity : O(1)
	public static int[] cyclicRotation(int arr[], int d) {
		
		int n = arr.length;
		for(int i = 0; i<d; i++) {
			int temp = arr[n-1];
			for(int j = n-1; j>0; j--) {
				arr[j] = arr[j-1];
			}
			arr[0] = temp;
		}
		
		return arr;
	}
	
	public static int[] reversalAlgorithm(int arr[], int d) {
		
		arr = ArrayRotation.reverseArray(arr, 0,arr.length-1);
		arr = ArrayRotation.reverseArray(arr, 0,d-1);
		arr = ArrayRotation.reverseArray(arr, d,arr.length-1);
		return arr;
	}
	public static void main(String args[]) {
		int arr[] = {1,2,3,4,5};
		arr = cyclicRotation(arr, 1);
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println(" ");
		int arr_reversal[] = {1,2,3,4,5};
		arr_reversal= reversalAlgorithm(arr_reversal, 1);
		for(int i = 0; i<arr_reversal.length; i++) {
			System.out.print(arr_reversal[i] + " ");
		}
	}
	

}
