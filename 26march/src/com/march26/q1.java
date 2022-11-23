package com.march26;

import java.util.ArrayList;

class A{
	int i;
	A(int i){
		this.i=i;
	}
	public String toString() {
		return "i="+i;
	}
}
public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList list=new ArrayList();
        list.add(new A(10));
        list.add(new A(15));
        list.add(new A(20));
        System.out.println(list);
        
	}

}
