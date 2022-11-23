package sorting;

public class insertionsort {
//time complexity is o(n2)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= {9,5,8,3,6,3,4,5,7,2,1,3};
        for(int i=1;i<arr.length;i++) {
        	int j=i-1;
        	int current=arr[i];
            while(j>=0 && current<=arr[j]) {
            	arr[j+1]=arr[j];
            	j--;
            }
            arr[j+1]=current;
        }
        for(int i=0;i<arr.length;i++) {
              System.out.print(arr[i]+" ");	
        }
	}

}
