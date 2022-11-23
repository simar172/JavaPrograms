package palin;

import java.util.PriorityQueue;

public class n_ropes {
	public static int rope(int arr[],int k) {
		PriorityQueue<Integer> a=new PriorityQueue<>();
		for(int i=0;i<arr.length;i++) {
			a.add(arr[i]);
		}
		int ans=0;
		while(a.size()>1) {
			int first=a.poll();
			int second=a.poll();
			int sum=first+second;
			ans=ans+sum;
			a.add(sum);
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= {2,5,4 ,8,6,9};
        int k=3;
        System.out.println(rope(arr, k));
	}

}
