package com.april30;

import com.april30.M.test;

class M{
	enum test{
		A,B,C,D;
	}
}
public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        M.test a=M.test.D;
        System.out.println(a.ordinal());
        
	}

}
