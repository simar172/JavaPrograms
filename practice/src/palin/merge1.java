package palin;

public class merge1 {
     public static void mer(int arr[],int si,int mid,int ei) {
    	
    	 int merged[]=new int[ei-si+1];
//    	 int mid=si+(ei-si)/2;
    	 int idx1=si;
    	 int idx2=mid+1;
    	 int x=0;
    	 
    	 while(idx1<=mid && idx2<=ei) {
    		 if(arr[idx1]<=arr[idx2]) {
    			 merged[x]=arr[idx1];
    			 idx1++;
    			 x++;
    		 }
    		 else {
    			 merged[x]=arr[idx2];
    			 idx2++;
    			 x++;
    		 }
    	 }
    	 while(idx1<=mid) {
    		 merged[x]=arr[idx1];
    		 idx1++;
    		 x++;
    	 }
    	 while(idx2<=ei) {
    		 merged[x]=arr[idx2];
    		 idx2++;
    		 x++;
    	 }
    	 for(int i=0,j=si;i<merged.length;i++,j++) {
    		 arr[j]=merged[i];
    	 }
     }
     public static void divide(int arr[],int si,int ei) {
    	 if(si>=ei) {
    		 return;
    	 }
    	 int mid=si+(ei-si)/2;
    	 divide(arr,si,mid);
    	 divide(arr,mid+1,ei);
    	 mer(arr,si,mid,ei);
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= {5,4,3,2};
//        mer(arr,0,arr.length-1);
        divide(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++) {
        	System.out.println(arr[i]);
        }
	}

}
