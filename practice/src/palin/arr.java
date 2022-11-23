package palin;

import java.util.Arrays;

public class arr {
	static void large(int arr[]) {

		Arrays.sort(arr);

		int ans[] = new int[3];
		ans[0] = arr[arr.length - 1];
		ans[1] = arr[arr.length - 2];
		ans[2] = arr[arr.length - 3];
		for (int i = 0; i < ans.length; i++) {
               System.out.println(ans[i]);
		}

	}
	
	public static void main(String[] args) {
		int arr[]= {4,5,3,2};
		large(arr);
	}
}
