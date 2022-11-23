package datastr;

import java.util.HashSet;

public class union_hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashSet<Integer> a=new HashSet<Integer>();
        a.add(5);
        a.add(10);
        a.add(15);
        a.add(5);
        HashSet<Integer> b=new HashSet<Integer>();
        b.add(10);
        b.add(15);
        b.add(4);
        b.add(5);
        b.addAll(a);
        System.out.println(b);
        System.out.println(b.size());
	}

}
