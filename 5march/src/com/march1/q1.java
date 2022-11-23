package com.march1;

public class q1 implements Cloneable{
     int i;
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
        q1 a1=new q1();
        a1.i=10;
        q1 a2=(q1)a1.clone();
//        a1.i=1;
//        System.out.println(a2.i);
//        a1.i=20;
//        System.out.println(a1.i);
        System.out.println(a2.i);

	}

}
