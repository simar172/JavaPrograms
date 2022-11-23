package datastr;

import java.util.HashSet;

public class dups_in_string {
       static void dups(String s) {
    	   HashSet<Character> a=new HashSet<>();
    	   HashSet<String> b=new HashSet<>();
    	   String t="";
    	   for(int i=0;i<s.length();i++) {
    		   if(a.contains(s.charAt(i))) {
    			   t=t+s.charAt(i);
    		   }
    		   else {
    			   a.add(s.charAt(i));
    		   }
    	   }
    	   b.add(t);
    	   System.out.println(b.get(b.size()));
       }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s="test string";
       dups(s);
	}

}
