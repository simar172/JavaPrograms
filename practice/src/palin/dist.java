package palin;

public class dist {
	public boolean isPalindrome(String s) {
	String c="";
	String d="";
	char e;
	for(int i=0;i<s.length();i++) {
		e=s.charAt(i);
		if(Character.isLetterOrDigit(e)) {
		     d=d+e;
		}
	}
	

	char a;
	for(int i=s.length()-1;i>=0;i--) {
		a=s.charAt(i);
		if(Character.isLetterOrDigit(a)){
		c=c+a;
		}
	}

	if(d.equalsIgnoreCase(c)) {
		return true;
	}
	return false;
} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println(palin1("A man, a plan, a canal: Panama"));
	}

}
