package datastr;

public class check_palin {
	
	public static void palin(String str) {
		int i=0;
		for(int j=str.length()-1;j>0;j--) {
			if(str.charAt(i)!=str.charAt(j)) {
				System.out.println("no "+str.charAt(i));
			}
			else {
				System.out.println("yes "+str.charAt(i));
			}i++;
		}
	}
	
	public static void main(String[] args) {
           String str="aabaacaabaa";
           palin(str);
	}
}
