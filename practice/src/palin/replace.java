package palin;

import java.util.Scanner;

import jdk.internal.misc.FileSystemOption;

public class replace {
	static Scanner s=new Scanner(System.in);
  static void rep(String a) {
	  String b="";
	  
	  for(int i=0;i<a.length();i++) {
		  for(int j=i+1;j<a.length();j++) {
	  if(a.charAt(i)==a.charAt(j)) {
		  b=a.replace(s.next(),s.next());
	  }
	  
		  }
		  }
	  System.out.println(b);
  }
  static String rep1(String a,int i) {
	  String b="";
//	  i++;
	  if(i+1>a.length()) {
//		  System.out.println(b);
		  System.out.println(b);
		  return b;
	  }
	  for(int k=0;k<a.length()-1;k++) {
	  if(a.charAt(k)==a.charAt(i+1)) {
		  b=a.replace("m", "x");
//		  i++;
		  System.out.println(b);
		   rep1(b, i++);
	  }
	  else {
	  i++;
	  rep1(b, i);
	  }}
	return b;
	  
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        String a=s.next() ; 
        
//       rep(a);
       System.out.println(rep1(a, 0));
	}

}
