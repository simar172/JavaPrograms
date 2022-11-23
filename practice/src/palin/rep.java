package palin;

public class rep {
	 public  static String longestPalindrome(String s) {
		 
	        for(int i=0;i<s.length();i++) {
	        	for(int j=i+1;j<s.length();j++) {
	        		if(s.charAt(i)==s.charAt(j)) {
//	        			if(a.charAt(i)==a.charAt(j)) {
//	        				return;
//	        			}
	        			System.out.print(s.charAt(i));
	        		
//	        			break;
	        		}
	        		else {
	        			return s.charAt(j);
	        		}
	        		
	        		    
	        		
	        	}
	        }return "";
			
		}
	 
	        
	 

	public static void main(String[] args) {
		System.out.println(longestPalindrome("ssi"));
		
		// TODO Auto-generated method stub
//        String a="ssismaa";
//        for(int i=0;i<a.length();i++) {
//        	for(int j=i+1;j<a.length();j++) {
//        		if(a.charAt(i)==a.charAt(j)) {
////        			if(a.charAt(i)==a.charAt(j)) {
////        				return;
////        			}
//        			System.out.print(a.charAt(i));
//        		
////        			break;
//        		}
//        		else {
//        		    
//        		}
//        	}
//        }
//	}

}}
