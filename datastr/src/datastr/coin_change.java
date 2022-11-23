package datastr;

import java.util.*;

class coin{
	//gfg sol
	static List<Integer> minPartition(int N)
    {
        List<Integer> li = new ArrayList<Integer>();
        // code here
         int coins[] = { 1, 2, 5, 10, 20, 50, 100, 200, 500, 2000 };
        for(int i=coins.length-1;i>=0;i--){
            if(N>=coins[i]){
                li.add(coins[i]);
                N=N-coins[i];
                i++;
            }
        }return li;
    }
	
	
	static void coin(int coins[],int n) {
		Arrays.sort(coins);
		int index=coins.length-1;
		while(true) {
			int coinval=coins[index];
			index--;
			int max=(n/coinval)*coinval;
			if(max>0) {
				System.out.println("coinvalue "+coinval+" count "+n/coinval);
				n=n-max;
			}
			if(n==0)break;
		}
	}
}
public class coin_change {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= {1,2,5,10,20,50,10,1000};
		coin.coin(arr, 900);
	}

}
