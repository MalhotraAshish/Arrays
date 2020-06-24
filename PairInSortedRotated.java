package Arrays_git;

public class PairInSortedRotated {
	
	//brute force 
	//Time Complexity: O(n^2)
	public static boolean pairInSortedRotated(int arr[], int sum) {
		for(int i = 0; i<arr.length; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if((arr[i]+arr[j]) == sum){
					return true;
				}
			}
		}
		return false;
	}
	
	//Two pointer approch
	//Time Complexity: O(n)
	public static boolean twoPointerApproch(int arr[], int sum) {
		int pivot_index = findPivot(arr,0,arr.length);
		int next_to_pivot = (pivot_index+1)%arr.length;
		
		
		while(pivot_index != next_to_pivot) {
			if(arr[pivot_index]+arr[next_to_pivot] == sum) {
				return true;
			}
			if(arr[pivot_index]+arr[next_to_pivot] > sum) {
				pivot_index = (arr.length + pivot_index -1)%arr.length;
			}else if(arr[pivot_index]+arr[next_to_pivot] <sum){
				next_to_pivot = (next_to_pivot+1)%arr.length;
			}
		}
		return false;
	}
	
	private static int findPivot(int[] arr, int start, int end) {
		int mid = (start+end)/2;
		if(start > end) {
			return -1;
		}
		if(start == end) {
			return start;
		}
		if(mid<end && arr[mid] > arr[mid+1]) {
			return mid;
		}
		if(mid>start && arr[mid-1] > arr[mid]) {
			return mid-1;
		}
		if(arr[start]>=arr[mid]) {
			return findPivot(arr,start,mid);
		}
		return findPivot(arr,mid+1,end);
	}

	public static void main(String args[]) {
		int arr[] = {11, 15, 6, 8, 9, 10};
		System.out.println(pairInSortedRotated(arr, 16)); 
		System.out.println(twoPointerApproch(arr, 16));
	}
}
