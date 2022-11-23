package datastr;

import java.util.*;

class imple {
	Map<Character, imple> ma;
	boolean endofstring;

	public imple() {
		ma = new HashMap<>();
		endofstring = false;
	}

}

class call{
	imple root;

	public call() {
		root=new imple();
		System.out.println("created");
	}
	
	
	public void insert(String word) {
		imple curr=root;
		for(int i=0;i<word.length();i++) {
			char temp=word.charAt(i);
			imple newt=curr.ma.get(temp);
			if(newt==null) {
				newt=new imple();
				curr.ma.put(temp, newt);
			}
			curr=newt;
		}
		curr.endofstring=true;
	}
}

public class Tries {
	
	public static void main(String[] args) {
		call c=new call();
		c.insert("simar");
		c.insert("sima");
	}
	
}
