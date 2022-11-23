package palin;

public class selection1 {
    public static void sel(int arr[]) {
    	for(int i=0;i<arr.length-1;i++) {
    		int smallest=i;
    		for(int j=i+1;j<arr.length;j++) {
    			if(arr[smallest]>arr[j]) {
    			smallest=j;
    			}
    		}
    		int temp=arr[smallest];
    		arr[smallest]=arr[i];
    		arr[i]=temp;
    	}
    	
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int arr[]= {3,2,4,1};
         sel(arr);
	      for(int i=0;i<arr.length;i++) {
	    	  System.out.println(arr[i]);
	      }
	}

}
