package com.march31;
class C<T>{
	T data;
	int a;
	int b;
	T get() {
	    return a+b;
	}
}

public class q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       C <String> b1=new C<String>();
       System.out.println(b1.data);
       System.out.println(b1.get());
       
	}

}

