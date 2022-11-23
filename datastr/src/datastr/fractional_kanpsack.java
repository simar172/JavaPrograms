package datastr;

public class fractional_kanpsack {
     int knapsack(int profit[],int weight[],int capacity,int currentindex) {
    	if(capacity<=0 || currentindex<0 || currentindex>=profit.length) {
    		return 0;
    	}
    	int profit1=0;
    	if(capacity>=weight[currentindex]) {
             profit1=profit[currentindex]+knapsack(profit,weight,capacity-weight[currentindex],currentindex+1);
             }
    	int profit2=knapsack(profit, weight, capacity, currentindex+1);
    	return Math.max(profit2, profit1);
    	}
    
     int knapsack(int profit[],int weight[],int capacity) {
    	return this.knapsack(profit, weight, capacity,0);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fractional_kanpsack a=new fractional_kanpsack();
		int profits[]= {31,26,17,72};
		int weight[]= {3,1,2,5};
		System.out.println(a.knapsack(profits, weight, 7));
	}

}
