package com.april24;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class q3{
	static String name;
	static int salary;
	public q3(String name,int salary){
		this.name=name;
		this.salary=salary;
	}
	public String toString() {
		return "name"+name+"salary"+salary;
	}
}
public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList a=new ArrayList();
        a.add(new q3("A",2000));
        a.add(new q3("B",3000));
        a.add(new q3("C",4000));
        a.add(new q3("D",5000));
        a.add(new q3("E",6000));
        Object li=a.stream().sorted((e1,e2)->e1.salary.compareTo(e2.salary)).collect(Collectors.toList());
	}

}
