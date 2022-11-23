package datastr;

public class buy_sell_stock {
public static int maxProfit(int[] prices) {
        int min=prices[0];
        
        for(int i=0;i<prices.length;i++) {
        	if(min>prices[i]) {
        		min=prices[i];
        	}
        }
        int max=prices[1];
        for(int i=min;i<prices.length;i++) {
        	if(max<prices[i]) {
        		max=i;
        	}
        }
        if(max==prices[1]) {
        	return 0;
        }
        return max+1;
        		
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int prices[]= {7,6,4,3,1};
        System.out.println(maxProfit(prices));
	}

}
