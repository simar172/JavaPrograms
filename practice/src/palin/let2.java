package palin;

public class let2 {
public static String longestPalindrome(String s) {
//	babad
	     
	     String a="";
	     if(s.length()>1) {
	    	 int i=0;
	    	 int j=0;
	    	 String t="";
        for(i=0;i<s.length();i++) {
        	for(j=i+1;j<s.length();j++) {
        		if(s.charAt(i)==s.charAt(j)) {
        			t=""+s.charAt(i);
        			a=a+s.charAt(i);
        		}
        		else {
        			
        		}
        	}
        }
//		return a+s.charAt(s.lastIndexOf(s.charAt(t)));
		}
	   
	    	 return ""+s.charAt(0);
	     
        }
	     
        static String o(String s) {
        	for(int i=0;i<s.length()-1;i++)
            {
                for(int j=i+1;j<s.length();j++)

                {
                if(s.charAt(i)==s.charAt(j))
                {
                    return ""+s.charAt(j);
//                    System.out.print(s.charAt(j));
                }
                }
            }
			return s;
        }
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "babad";
		System.out.println(longestPalindrome(s));
		o(s);
	}

}
