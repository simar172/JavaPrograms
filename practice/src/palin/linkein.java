package palin;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class linkein {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		LinkedList list=new LinkedList();
		list.add(10);
		list.add(20);
		list.add(30);
		Collections.sort(list,Collections.reverseOrder());
		LinkedList list1=new LinkedList();
		list1.add(40);
		list1.add(50);
		list1.add(60);
		Collections.sort(list1,Collections.reverseOrder());
	    list.add(list1);
	    System.out.println(list);
//		list.add(1);
//		list.add(5);
//		list.add(7);
//		list.add(3);
//		list.add(8);
//		list.add(2);
//		list.add(3);
//		System.out.println(list);
//		System.out.println(list.contains(7));
//		System.out.println("index"+list.indexOf(7));
        
	}

}
