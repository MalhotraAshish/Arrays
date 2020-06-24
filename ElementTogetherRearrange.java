package Arrays_git;

public class ElementTogetherRearrange {

	public static void main(String[] args) {
		int arr[] = {2, 7, 9, 5, 8, 7, 4};
		System.out.println(rearrange(arr, 5));

	}

	private static int rearrange(int[] arr, int k) {
		int swaps = 0;
		int count = 0;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]<=k) {
				count++;
			}
		}
		for(int i = 0; i<arr.length; i = i+count) {
			for(int j = i; j<count; j++) {
				if(arr[j]>k) {
					swaps++;
				}
			}
		}
		return swaps;
	}

}
