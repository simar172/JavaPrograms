package com.april19;
interface E{
	void test(int i,String s);
}
public class q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        E a1=(i,s)->System.out.println(i+s);
        a1.test(5, "simar");
	}

}
