package basicArrays;

public class QueryLeftRightShift {
	
	public static void queryLeftRight(int arr[], int query[]) {
		int sum = 0;
		if(query[0] == 1) {
			arr = CyclicRotationOfArray.cyclicRotation(arr, query[1]);
		}else if(query[0] == 2) {
			arr = ArrayRotation.brutForce(arr, query[1]);
		}else if(query[0] == 3){
			for(int i = query[1]; i<=query[2]; i++) {
				sum = sum + arr[i];
			}
			System.out.println(sum);
		}
	}
	public static void main(String args[]) {
		int arr[] = {1,2,3,4,5};
		int query1[] = {1,3};
		int query2[] = {3,0,2};
		int query3[] = {2,1};
		int query4[] = {3,1,4};
		queryLeftRight(arr, query1);
		queryLeftRight(arr, query2);
		queryLeftRight(arr, query3);
		queryLeftRight(arr, query4);
	}

}
