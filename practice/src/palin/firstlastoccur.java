package palin;

public class firstlastoccur {
	static int first=-1;
	static int last=-1;
      static void a(String s,int idx) {
    	  if(idx==s.length()) {
    		  System.out.println(first);
    		  System.out.println(last);
    		  return;
    	  }
    	  char curchar=s.charAt(idx);
    	  if(curchar=='x') {
    	  if(first==-1) {
    		  first=idx;
    		  
    	  }
    	  else {
    		  last=idx;
    		  
    	  }
    	 }
    	  a(s,idx+1);
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        a("axbxbx",0);
	}

}
