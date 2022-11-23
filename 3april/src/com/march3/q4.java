package com.march3;
class M <B extends Number>{
	public void test( String a) {
		System.out.println(a);
	}
}

public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        M<Integer> a1=new <Integer>M();
        a1.test("simar");
        M<String> a2= new <String>M();
        a1.test("misar  ");
	}

}
