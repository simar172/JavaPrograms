package com.march29;

import java.util.Hashtable;

class A{
	int i;
	A(int i){
		this.i=i;
	}
	public String toString() {
	    return "i=" +i;
	}
}
public class q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Hashtable l=new Hashtable();
        l.put(new A(10),"hello");
        l.put(new A(20),"hello");
        l.put(new A(30),"hello");
        System.out.println(l);
	}

}
