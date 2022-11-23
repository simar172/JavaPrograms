package sheet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class reverse_array {
    public static void rev(int arr[]) {
    	ArrayList<Integer> a=new ArrayList<Integer>();
    	for(int i=0;i<arr.length;i++) {
    		a.add(arr[i]);
    	}
    	Collections.reverse(a);
    	int new1[]=new int[arr.length];
    	for(int i=0;i<new1.length;i++) {
    		new1[i]=a.get(i);
    	}
    	for(int i=0;i<new1.length;i++) {
    		System.out.print(new1[i]);
    	}
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
        int arr[]= new int[s.nextInt()];
        for(int i=0;i<arr.length;i++) {
        	arr[i]=s.nextInt();
        }
        rev(arr);
	}

}
