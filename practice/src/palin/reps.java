package palin;

public class reps {
	public static int myAtoi(String s) {
		String b=" ";
		String c="1";
		String d=" ";
//		int d=Integer.parseInt(c);
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==d.charAt(0)) {
				break;
			}
			else {
				System.out.println(s.charAt(i));
			}
		}
		return 0;
    
         	
        

	
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(myAtoi(" -42 with"));
	}

}
