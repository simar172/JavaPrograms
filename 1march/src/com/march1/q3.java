package com.march1;
class D{
	int i;
    D(int i){
    	this.i=i;
    }	
	
}
public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        D a1=new D(10);
        D a2=new D(10);
        System.out.println(a1.hashCode());
        System.out.println(a2.hashCode());
	}

}
