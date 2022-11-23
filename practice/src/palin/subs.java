package palin;

import java.util.HashMap;

public class subs {
public static int lengthOfLongestSubstring(String s) {
        int count=0;
        int e=0;
        String d=" ";
       HashMap<Integer,Character> a=new HashMap<Integer,Character>();
       
       if(a.containsValue(d)) {
    	   count++;
    	   return count;
       }
       
       else {
       for(int i=1;i<s.length();i++) {
    	   char c=s.charAt(i);
    	   
    	   if(a.containsValue(c)) {
//    		   count--;
    		  e++;
    	   }
    	   
    	   else {
    		   a.put(i, c);
    		   count++;
    	   }
//    	   System.out.println(d.length());
//    	   System.out.println(a);
       }return count;
        }}
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s= " ";
        System.out.println(lengthOfLongestSubstring(s));
	}

}
