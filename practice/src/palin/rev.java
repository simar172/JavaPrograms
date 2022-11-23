package palin;

public class rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="madam";
		String b="";
		char c;
		for(int i=0;i<a.length();i++) {
			c=a.charAt(i);
			b=c+b;
			
	      }
	
		if(a.equals(b)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("no");
		}
	     
		
	}

}
