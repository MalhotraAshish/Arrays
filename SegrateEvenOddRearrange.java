package Arrays_git;

import java.util.Arrays;

public class SegrateEvenOddRearrange {
	public static void main(String args[]) {
		int arr[] = { 1, 3, 2, 4, 7, 6, 9, 10 };
		System.out.println(Arrays.toString(rearrange(arr)));
	}

	private static int[] rearrange(int[] arr) {
		int i = -1, j = 0;
		while (j != arr.length-1) { 
            if (arr[j] % 2 == 0) 
            { 
                i++; 
                System.out.println(arr[j] + " " + arr[i]);
                // Swapping even and 
                // odd numbers 
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
            j++; 
        } 
		/*int new_Arr[] = new int[arr.length];
		int j = 0;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]%2 == 0) {
				new_Arr[j] = arr[i];
				j++;
			}
			
		}
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]%2 != 0) {
				new_Arr[j] = arr[i];
				j++;
			}
			
		}*/
		return arr;
	}
}
