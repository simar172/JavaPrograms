package com.march1;
class K{
	String i;
	int j;
	int k;
	K(String i,int j,int k){
		this.i=i;
		this.j=j;
		this.k=k;
	}
	public int hashCode(){
		int result=0;
		result=result+i.hashCode();
		result=result+Integer.toString(j).hashCode();
		result=result+Integer.toString(k).hashCode();
		return result;
	}
}
public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        K a1=new K("simar",10,11);
        K a2=new K("simar",10,11);
        System.out.println(a1.hashCode());
        System.out.println(a2.hashCode());
	}

}
