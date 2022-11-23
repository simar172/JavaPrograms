package datastr;
import java.util.*;
public class input_string {
	public static String removeDuplicateLetters(String s) {
	       HashMap<Character,Integer> count=new HashMap<>();
	        for(int i=0;i<s.length();i++){
	            if(!count.containsKey(s.charAt(i))){
	                count.put(s.charAt(i),1);
	            }
	            else{
	             count.put(s.charAt(i),count.get(s.charAt(i))+1);   
	            }
	        }
	        String e="";
	        for(Map.Entry use:count.entrySet()){
	            char key=(char)use.getKey();
	            int val=(int)use.getValue();
	            if(val>1){
	            e=e+key;}
	        }return e;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(removeDuplicateLetters("bcabc"));
	}

}
