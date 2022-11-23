package palin;

import java.util.HashMap;

public class map {
	public static void map1(int arr[],int sum) {
		int start=0;
		int end=-1;
		int currsum=0;
		HashMap<Integer,Integer> a=new HashMap<Integer,Integer>(); 
		for(int i=0;i<arr.length;i++) {
			currsum=currsum+arr[i];
			if(currsum==sum) {
				start=0;
				end=i;
				break;
			}
			if(a.containsKey(currsum-sum)) {
				start=a.get(currsum-sum)+1;
				end=i;
				break;
			}
			a.put(currsum,i);
		}
		if(end==-1) {
			System.out.println("not");
		}
		else {
			System.out.println("start"+start+"end"+end);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= {10,15,-5,15,-10,5};
        map1(arr, 5);
	}

}
