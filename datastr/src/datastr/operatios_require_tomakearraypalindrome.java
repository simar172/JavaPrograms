package datastr;

public class operatios_require_tomakearraypalindrome {
	public static int ops(int arr[],int n) {
		int ans=0;
		for(int i=0,j=n-1;i<=j;) {
			if(arr[i]==arr[j]) {
				i++;
				j--;
			}
			else if(arr[i]>arr[j]) {
				j--;
				arr[j]=arr[j]+arr[j+1];
				ans++;
			}
			else {
				i++;
				arr[i]=arr[i]+arr[i-1];
				ans++;
			}
		}return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[]{11, 14, 15, 99} ;
		System.out.println(ops(arr,arr.length));
	}

}
