package sorting;



public class mergesort {
	//timecomplexity O(nlogn)
	public static void conquer(int arr[],int si,int mid,int ei) {
		//for conquer timecomplexity is o(n)
		int merged[]=new int[ei-si+1];
		int idx1=si;
		int idx2=mid+1;
		int x=0;
		while(idx1<=mid && idx2<=ei) {
			//int arr[]= {2,3,1,4,5};
			if(arr[idx1]<=arr[idx2]) {
				merged[x]=arr[idx1];
				x++;
				idx1++;
			}
			else {
				merged[x]=arr[idx2];
				x++;
				idx2++;				
			}
		}
		while(idx1<=mid) {
			merged[x]=arr[idx1];
			x++;
			idx1++;
		}
		while(idx2<=ei) {
			merged[x]=arr[idx2];
			x++;
			idx2++;
		}
		for(int i=0,j=si;i<merged.length;i++,j++) {
			arr[j]=merged[i];
		}
	}
      public static void divide(int arr[],int si,int ei) {
    	//for divide timecomplexity is o(logn)
    	  if(si>=ei) {
    		  return;
    	  }
    	  int mid=si+(ei-si)/2;
    	  divide(arr,si,mid);
    	  divide(arr,mid+1,ei);
    	  conquer(arr,si,mid,ei);
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to nlogn
          int arr[]= {2,3,1,4,5};
          divide(arr,0,arr.length-1);
          for(int i=0;i<arr.length;i++) {
        	  System.out.print(arr[i]+" ");
          }
          System.out.println();
	}

}