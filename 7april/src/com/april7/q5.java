package com.april7;

public class q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Thread a=new Thread();
        a.setName("simar");
        a.setPriority(10);
        System.out.println(a.getName());
        System.out.println(a.getPriority());
        System.out.println(a.getId());
	}

}
