package palin;

public class occurrofx {
       static void a(String s,int idx,int count,String n) {
    	   if(idx==s.length()) {
    		   for(int i=0;i<count;i++) {
    		   n=n+'x';
    		   }
    		   System.out.println(n);
    		   return;
    	   }
    	char curchar=s.charAt(idx);
    	if(curchar=='x') {
    		count++;
    		a(s,idx+1,count,n);
    	}
    	else {
    		n=n+curchar;
    		a(s,idx+1,count,n);
    		return;
    	}
    	
       }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          a("axbxcx",0,0,"");
	}

}
