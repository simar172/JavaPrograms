package com.march3;
interface B<B>{
	void test(B a);
}
class D implements B<String>{
	public void test(String a) {
		System.out.println(a);
	}
}
public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        D a1=new D();
        a1.test("simar");
	}

}
