package Arrays_git;

import java.util.Arrays;

public class MinMaxRearrange {

	public static void main(String args[]) {
		int arr[] = {1, 2, 3, 4, 5, 6, 7};
		System.out.println(Arrays.toString(rearrange(arr)));
	}

	private static int[] rearrange(int[] arr) {
		int max_index = arr.length-1, min_index = 0, max_element = arr[max_index] + 1;
		for(int i = 0; i<arr.length; i++) {
			if(i%2 == 0) {
				arr[i] = arr[i] + (arr[max_index] % max_element) * max_element;
				max_index--;
			}else{
				arr[i] = arr[i] + (arr[min_index] % max_element) * max_element;
				min_index++;
			}
		}
		for(int i = 0; i<arr.length; i++) {
			arr[i] = arr[i]/max_element;
		}
		return arr;
	}
	
}
