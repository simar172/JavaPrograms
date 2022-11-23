package datastr;

public class reversing_array_makes_sort {
	static boolean match(String pattern, String str)
	   {
	       // code here
	      StringBuilder npat = new StringBuilder();

	       for(char c:pattern.toCharArray()){
	           if(c=='*'){
	               npat.append("[a-zA-Z0-9]*");
	           }else if(c=='?'){
	               npat.append(".");
	           }else{
	               npat.append(c);
	           }
	       }
//	       npat.append("$");

	       return str.matches(npat.toString());
	   }
	 
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String wild="ge?ks*";
		String pattern="geeksforgeeks";
		System.out.println(match(wild, pattern));
	}

}
