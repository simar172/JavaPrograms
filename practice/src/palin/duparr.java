package palin;

import java.util.Arrays;

public class duparr {
//    static int rep(int arr[],int size) {
//    	return rep1( arr,size);
//    }
    public static int majorityElements(int arr[], int size) {
    	 Arrays.sort(arr);
    	 int majorityElement = 0;
    	 int count = 0;
    	 for (int i = 0; i < size; i++) {
    	  for (int j = i + 1; j < size; j++) {
    	   if (arr[i] == arr[j]) {
    	    count++;
    	   }
    	  }
    	  if (count > (size / 2)) {
    	   majorityElement = arr[i];
    	  }
    	 }
    	 if (majorityElement == 0) {
    	  return -1;
    	 }
    	 return majorityElement;
    	}
    	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[]= {3,1,3,3,2};
      int size=arr.length;
     System.out.println(majorityElements(arr,size));
	}

}
