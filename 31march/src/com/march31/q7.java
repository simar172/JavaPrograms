package com.march31;
class B<T>{
	T data;
}

public class q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        B<String> a1=new B<String>();
        a1.data="hello";
        System.out.println(a1.data);
        B<Integer> a2=new B<Integer>();
        a2.data=123;
        System.out.println(a2);
	}

}
