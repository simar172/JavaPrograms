package datastr;

public class compare {

	static boolean check(int arr[],int arr1[]) {
		if(arr.length == arr1.length) {
			for(int i = 0;i<arr.length;i++) {
				if(arr[i] == arr1[i]) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 4 };
		int arr1[] = { 1,2,3,4 };
		System.out.println(check(arr,arr1));
	}

}
