package palin;

public class vow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String a="simartattikhale";
          int b[]= {'a','e','i','o','u'};
          for(int i=0;i<a.length();i++) {
        	  for(int j=0;j<b.length;j++) {
        		  if(a.charAt(i)==b[j]) {
        			int c=a.charAt(i);
        			System.out.println("vowel is present at"+" "+i);
        			  }
        		  
        	  }
          }
        	
	}

}
