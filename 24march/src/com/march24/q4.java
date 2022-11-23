package com.march24;

import java.util.ArrayList;

public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList list=new ArrayList();
        list.add(90);
        ArrayList list1=new ArrayList();
        list1.add(90);
        System.out.println(list.equals(list1));
        System.out.println(list.hashCode());
        System.out.println(list1.hashCode());
	}

}
