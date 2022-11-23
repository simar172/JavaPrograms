package datastr;

public class Searching_in_an_array_where_adjacent_differ {
	
	public static int search (int arr[], int n, int x, int k) {
		
        //Complete the function
		int c=-1;
		for(int i=0;i<n;i++) {
			if(arr[i]==x) {
				c=i;
				break;
			}
		}
		return c;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= {4, 5, 6, 7, 6};
        int k=1;
        int x=6;
        System.out.println(search(arr, arr.length, x, k));
	}

}
