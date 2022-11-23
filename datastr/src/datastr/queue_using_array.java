package datastr;

public class queue_using_array {
	static int capacity;
	static int rear;
	 public queue_using_array(int n){
		 capacity=n;
		 rear=-1;
	}
     public static void enqueu(int a[],int data) throws Exception {
    	 if(rear==capacity-1) {
    		 throw new Exception();
    	 }
    	 rear++;
    	 a[rear]=data;
     }
     public static int deque(int a[],int n) throws Exception {
    	 if(rear==-1) {
    		 throw new Exception();
    	 }
    	 int result=a[0];
    	 for(int i=0;i<rear;i++) {
    		 a[i]=a[i+1];
    		 rear--;
    	 }
		return result;
     }
     public static int getfront(int a[],int n) throws Exception {
    	 if(rear==-1) {
    		 throw new Exception();
    	 }
    	 return a[0];
     }
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        int arr[]= {1,2,3,4};
        int data=5;
        enqueu(arr, data);
        deque(arr, data);
        System.out.println(getfront(arr,data));
        
	} 

}
