package Arrays_git;

public class RotationCount {

	//brute Force
	//Time Complexity: O(n)
	public static int rotationCount(int arr[]) {
		int min = Integer.MAX_VALUE;
		int index = -1;
		for(int i = 0;i<arr.length; i++) {
			if(arr[i]<min) {
				min = arr[i];
				index = i+1;
			}
		}
		return index;
	}
	
	//binary Search
	//Time Complexity: O(log n)
	//Space Complexity: O(1)
	public static int rotationCountBinarySearch(int arr[], int low, int high) {
		int mid = (low+high)/2;
		if(low>high) {
			return 0;
		}
		if(low == high) {
			return low;
		}
		if(high > mid && arr[mid+1]<arr[mid]) {
			return mid+1;
		}
		if(low < mid && arr[mid] < arr[mid-1]) {
			return mid;
		}
		if(arr[high] > arr[mid]) {
			return rotationCountBinarySearch(arr, low, mid-1);
		}
		return rotationCountBinarySearch(arr, mid+1, high);
	}
	public static void main(String args[]) {
		int arr[] = {15, 18, 20, 3, 6, 12};
		System.out.println(rotationCount(arr));
	}
}
