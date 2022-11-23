package palin;

public class selection {
	static void p(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[]= {6,7,5,4,8,2};
        for(int i=0;i<a.length-1;i++) {
        	int smallest=i;
        	for(int j=i+1;j<a.length;j++) {
        		if(a[smallest]>a[j]) {
        		smallest=j;
        	}
        		}
        	int temp=a[smallest];
        	a[smallest]=a[i];
        	a[i]=temp;
        	
        }
        p(a);
	}

}
