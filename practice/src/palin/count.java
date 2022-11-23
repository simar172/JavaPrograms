package palin;

public class count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String a="simarais";
        int count=0;
        for(int i=0;i<a.length();i++) {
        	if(a.charAt(i)=='a') {
        		count=count+1;
              }
        	
        }
        System.out.println(count);
	}

}
