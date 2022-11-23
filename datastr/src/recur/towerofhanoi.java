package recur;

public class towerofhanoi {
        static void tow(int n,String s,String h,String d) {
        	if(n==1) {
        		System.out.println("transfer"+  n+"from"+ s+"to"+ d);
        		return;
        	}
        	tow(n-1,s,d,h);
        	System.out.println("transferof"+ n+"from"+ s+"to"+ d);
        	tow(n-1,h,s,d);
        }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        tow(2,"A","B","C");
	}

}
