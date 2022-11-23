package datastr;

public class bookallocation {
	 static int largest(int arr[])
     {
         int i;
         int max = arr[0];
         for (i = 1; i < arr.length; i++)
             if (arr[i] > max)
                 max = arr[i];
          return max;
     }
	 static int sum(int arr[])
	    {
	        int sum = 0;
	        int i;
	        for (i = 0; i < arr.length; i++)
	            sum += arr[i];
	      return sum;
	    }
	 public static boolean isfeasible(int arr[],int key,int res) {
		 int sum=0;
		 int student=1;
		 for(int i=0;i<arr.length;i++) {
			 if((sum+arr[i])>res) {
				 student++;
				 sum=arr[i];
			 }
			 else {
				 sum=sum+arr[i];
			 }
		 }
		 return student<=key;
	 }
       
	 public static int books(int arr[],int key) {
		 int min=largest(arr);
		 int max=sum(arr);
		 int res=0;
		 while(min<=max) {
			 int mid=(min+max)/2;
			 if(isfeasible(arr,key,mid)) {
				 res=mid;
				 max=mid-1;
			 }
			 else {
				 min=mid+1;
			 }
		 }
		return res;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[]= {10,10,20,30};
       System.out.println(books(arr, 2));
	}

}
