package com.march26;

import java.util.ArrayList;
import java.util.Collections;

class B  implements Comparable{
	int i;
	B(int i){
		this.i=i;
	}
	public int compareTo(Object obj) {
		B a1=(B)obj;
		return i-a1.i;
	}
	public String toString() {
		return "i="+i;
	}
}
public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list =new ArrayList();
		list.add(new B(100));
		list.add(new B(20));
		list.add(new B(30));
		Collections.sort(list);
		System.out.println(list);
	}

}
