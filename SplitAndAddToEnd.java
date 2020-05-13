package basicArrays;

public class SplitAndAddToEnd {

	public static int[] splitandadd(int arr[], int k) {
		int temp[] = new int[k]; 
		
		for(int i = 0; i<k; i++) {
			temp[i] = arr[i];
		}
		
		for(int i = 0, j = k; j<arr.length && i<(arr.length-k); j++, i++){
			arr[i] = arr[j];
		}
		
		for(int i = arr.length-k, j= 0; i<arr.length && j<temp.length; i++, j++) {
			arr[i] = temp[j];
		}
		
		return arr;
	}
	public static void main(String args[]) {
		int arr[] = {12,10,5,6,52,36};
		arr = splitandadd(arr, 2);
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
	}
}
