package recur;

public class movingallxtolast {
      static void a(String str,int idx,int count,String n) {
    	 if(idx==str.length()) {
    		 for(int i=0;i<count;i++) {
    			 n=n+'x';
    			 }
    		 System.out.println(n);
    		 return;
    	 }
    	  char curchar=str.charAt(idx);
    	  if(curchar=='x') {
    		  count++;
    		  a(str,idx+1,count,n);
    	  }
    	  else {
    		  n=n+curchar;
    		  a(str,idx+1,count,n);
    	  }
      } 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        a("abcbdxbsxbsxbsx",0,0,"");
	}

}
