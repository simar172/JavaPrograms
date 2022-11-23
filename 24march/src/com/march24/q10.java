package com.march24;

import java.util.ArrayList;

public class q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		list.add("abc");
		list.add(20);
		list.add(30);
		System.out.println(list);
		boolean b=(boolean) list.remove(20);
		System.out.println(b);
		}

}
