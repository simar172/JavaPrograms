package datastr;

import java.util.HashSet;

public class count_of_distinctElements_using_hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       HashSet<Integer> a=new HashSet<Integer>();
       a.add(10);
       a.add(20);
       a.add(30);
       a.add(10);
       a.add(10);
       for(int b:a) {
    	   a.add(b);
       }
       System.out.println(a.size());
       
	}

}
