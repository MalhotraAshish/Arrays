package Arrays_git;

import java.util.Arrays;

public class NegativePositiveOrderIntactAndConstantSpaceRearrange {
	public static void main(String args[]) {
		int arr[] = {-12, 11, -13, -5, 6, -7, 5, -3, -6 };
		System.out.println(Arrays.toString(rearrange(arr)));
	}

	private static int[] rearrange(int[] arr) {
		for(int i = 1; i<arr.length; i++) {
			int temp = arr[i];
			int j = i-1;
			if(temp>0) {
				continue;
			}
			while(j>=0 && arr[j]>0) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;	
		}
		return arr;
	}
}
