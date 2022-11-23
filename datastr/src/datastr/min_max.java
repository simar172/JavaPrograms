package datastr;
import java.util.Arrays;

public class min_max {
	static class pair  
	{  
	    long first, second;  
	    public pair(long first, long second)  
	    {  
	        this.first = first;  
	        this.second = second;  
	    }  
	} 
	static pair getMinMax(long a[], long n)  
    {
        //Write your code here
       
        long max=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        
        long min=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        
        return new pair(min,max);
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
long a[]={3, 2, 1, 56, 10000, 167};
   System.out.println(getMinMax(a, 0));
	}

}
