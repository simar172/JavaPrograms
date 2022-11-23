package palin;

public class duplic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String a="simar w k d";
        String b="";
        for(int i=0;i<a.length();i++) {
        	for(int j=0;j<a.length();j++) {
        		if(a.charAt(i)==a.charAt(j)) {
        			    				
        			
        			System.out.println("repeated "+ a.charAt(j));
        			break;
        		}
        		else {
        			System.out.println("not repeated "+a.charAt(i));
        			break;
        		}
        	}
        }
	}

}
