package datastr;

import java.util.HashSet;

public class intersection_hashset {
	public static int intersect(int a[],int b[]) {
		HashSet c=new HashSet<>();
		int count=0;
		for(int x:a) {
			c.add(x);
		}
		for(int x:b) {
			if(c.contains(x)) {
				count++;
				c.remove(x);
			}
			
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,10,15,5,10};
		int b[]= {15,5,5,10,4};
		System.out.println(intersect(a,b));
	}

}
