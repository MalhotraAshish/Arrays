package basicArrays;

public class PivotBinarySearch {
// finding an element in a sorted and rotated array
	public static int pivotBinarySearch(int arr[], int key) {
		int index = -1, pivot_index = -1;
		pivot_index = findPivot(arr, 0, arr.length - 1);
		System.out.println(pivot_index);
		if (arr[pivot_index] == key) {
			index = pivot_index;
		}
		if (key > arr[0]) {
			index = binarySearch(arr, 0, pivot_index, key);
		}
		if (key < arr[0]) {
			index = binarySearch(arr, pivot_index + 1, arr.length - 1, key);
		}
		return index;
	}

	private static int binarySearch(int[] arr, int start, int end, int key) {
		int mid = (start+end)/2;
		if(arr[mid] == key) {
			return mid;
		}if(arr[mid] > key) {
			return binarySearch(arr,0, mid, key);
		}
		return binarySearch(arr, mid+1, end, key);
	}

	private static int findPivot(int[] arr, int start, int end) {
		int mid = (start + end) / 2;
		if (start > end) {
			return -1;
		}
		if (start == end) {
			return start;
		}
		if (mid < end && arr[mid] > arr[mid + 1]) {
			return mid;
		}
		if (mid > start && arr[mid] < arr[mid - 1]) {
			return mid - 1;
		}
		if (arr[start] >= arr[mid]) {
			return findPivot(arr, start, mid - 1);
		}
		return findPivot(arr, mid + 1, end);
	}

	public static void main(String[] args) {
		int arr[] = { 5, 6, 7, 8, 9, 10, 1, 2, 3 };
		System.out.println(pivotBinarySearch(arr, 9));
	}

}
