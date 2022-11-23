package palin;

public class check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[]= {1,2,3,4,5};
        for(int i=0;i<a.length;i++) {
        	for(int j=1;j<a.length;j++) {
        	if(a[i]<j && a[i]>j
        			) {
        		System.out.println(a[i]);
        	}
        }
       }
	}

}
