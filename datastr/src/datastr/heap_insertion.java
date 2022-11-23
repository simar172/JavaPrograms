package datastr;

public class heap_insertion {
    public static void insert(int a[],int n,int value) {
    	n=n+1;
    	a[n]=value;
    	int i=n;
    	while(i>=1) {
    		int parent=i/2;
    		if(a[parent]<a[i]) {
    			int temp=a[i];
    			a[i]=a[parent];
    			a[parent]=temp;
    			i=parent;
    		}
    		else {
    			return;
    		}
    	}
    	for(int j=0;j<=n;j++) {
    		   System.out.println(a[j]);
    	}
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a[]= {50,30,40,10,20,35,36};
       int n=5;
       insert(a, n, 100);
	}

}
