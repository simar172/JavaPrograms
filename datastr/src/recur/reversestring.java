package recur;

public class reversestring {
     static void rev(String a,int ind) {
    	 if(ind==0) {
    		 System.out.println(a.charAt(ind));
    		 return;
    	 }
    	 System.out.print(a.charAt(ind));
    	 rev(a,ind-1);
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String a="simar";
		rev(a,a.length()-1);
	}

}
