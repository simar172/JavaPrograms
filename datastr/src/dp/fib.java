package dp;
import java.util.*;
public class fib {
	public static int fibmemo(int n,HashMap<Integer,Integer> a) {
		if(n==1) {
			return 0;
		}
		if(n==2) {
			return 1;
		}
		if(!a.containsKey(n)) {
		    a.put(n,fibmemo(n-1,a)+fibmemo(n-2,a));
		}
		return a.get(n);
	}
	public static int fibusingtab(int n) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(0);
		a.add(1);
		for(int i=2;i<=n-1;i++) {
			int n1=a.get(i-1);
			int n2=a.get(i-2);
			a.add(n1+n2);
		}return a.get(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> a=new HashMap<Integer,Integer>();
         System.out.println(fibmemo(4, a));
         System.out.println(fibusingtab(4));
	}

}
