package datastr;

import java.util.HashMap;

public class subarrayofgivensum_hashmap {
	public static int[] twoSum(int nums[], int target) {
		int currsum = 0;
		int start = 0;
		int end = -1;
		int arr[] = new int[2];
		HashMap<Integer, Integer> a1 = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			currsum = currsum + nums[i];
			if (currsum == target) {
				start = 0;
				end = i;
				arr[0] = start;
				arr[1] = end;
				break;
			}
			if (a1.containsKey(currsum - target)) {
				start = a1.get(currsum - target) + 1;
				end = i;
				arr[0] = start;
				arr[1] = end;
				break;
			}
			a1.put(currsum, i);
		}
		if (end == -1) {
			System.out.println("not found");
		} else {
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//         int arr[]= {2,7,11,15};
		int arr[] = { 11, 15, 6, 8, 9, 10 };
		int sum = 17;
		twoSum(arr, sum);

	}

}
