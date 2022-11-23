package com.march26;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.march26.C.accid;
import com.march26.C.accrollno;

class C{
	
	
	int rollno;
	int id;
	C(int rollno,int id){
		this.rollno=rollno;
		this.id=id;
		}
	public String toString() {
		return "rollno="+rollno+ " " + "id="+id;
	}
    static class accrollno implements Comparator{
	public  int compare(Object o1,Object o2 ) {
	       return ((C)o1).rollno-((C)o2).rollno;
	}

	
	
	}
	static class accid implements Comparator{
		public int compare(Object o1,Object o2) {
		    	return ((C)o1).id-((C)o2).id;
		}

		
	}
}

public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList list=new ArrayList();
        list.add(new C(50,100));
        list.add(new C(20,30));
        list.add(new C(30,40));
        Collections.sort(list,new accid());
        System.out.println(list);
	}

}
