package palin;

public class present {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[]= {1,2,3,4,0};
        int b[]= {1,2,3,4,5};
        int c[][]= {a,b};
        for(int i=0;i<a.length;i++) {
        	for(int j=0;j<a.length;j++) {
        		if(a[i]!=b[i]) {
        			System.out.println(b[i]+" not present");
        			break;
        			}
        		else {
        			System.out.println(a[i]+" is present");
        			break;
        		}
        		
        	}
        }
	}

}
