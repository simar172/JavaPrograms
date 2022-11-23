package com.april19;
interface G{
	int test(int i,int j);
}
public class q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        G a1=(i,j)->i-j;
        System.out.println(a1.test(2, 5));
	}

}
