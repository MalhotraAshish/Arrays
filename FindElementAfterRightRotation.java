package Arrays_git;

public class FindElementAfterRightRotation {
	
	public static int findElement(int arr[], int range[][], int index) {
		for(int i = 0; i<range.length; i++) {
			arr = rotate(arr, range[i][0],range[i][1], 1);
		}
		
		return arr[index];
	}
	
	private static int[] rotate(int[] arr, int left, int right, int d) {
		int n = right;
		for(int i = 0; i<d; i++) {
			int temp = arr[n];
			for(int j = right; j>left; j--) {
				arr[j] = arr[j-1];
			}
			arr[left] = temp;
		}
		
		return arr;
	}

	public static void main(String args[]) {
		int arr[] = {1,2,3,4,5};
		int range[][] = {{0,2},{0,3}};
		System.out.println(findElement(arr, range, 1));
	}
}
