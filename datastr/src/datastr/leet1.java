package datastr;

public class leet1 {
	public static void countAndSay(int n) {
        if(n == 1) { 
        System.out.println( "1");
        return;
        }
        
        
         countAndSay(n-1);
        }
	public static void main(String[] args) {
            countAndSay(6);
	}
}
