package com.march24;

import java.util.ArrayList;
import java.util.Collections;

public class q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		list.add(10);
		list.add(9);
		list.add(30);
		Collections.sort(list,Collections.reverseOrder());
		System.out.println( list);
	}

}
