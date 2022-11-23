 package com.march1;
class test{
	int i=10;
}
public class q2 implements Cloneable{
     int j;
     test t;
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
      q2 a1=new q2();
      a1.j=10;
      test t=new test();
      a1.t=t;
      q2 a2=(q2)a1.clone();
      t.i=1;
      System.out.println(a2.t.i);
	}

}
