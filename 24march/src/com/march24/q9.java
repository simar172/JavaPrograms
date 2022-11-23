package com.march24;

import java.util.ArrayList;

public class q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.set(1, 40);
		System.out.println(list);
		list.clear();
		System.out.println(list);
	}

}
