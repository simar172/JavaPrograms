package datastr;

import java.util.ArrayList;

public class remove_consecutive_characters {
	 public static String removeConsecutiveCharacter(String S){
		  ArrayList<Character> a=new ArrayList<Character>();
		 String b=S.valueOf(S.charAt(0));
		 for(int i=1;i<S.length();i++) {
			 if(S.charAt(i)!=S.charAt(i-1)) {
				 b=b+S.charAt(i);
			 }
		 }
		return b;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="aabaa";
        System.out.println(removeConsecutiveCharacter(s));
	}

}
