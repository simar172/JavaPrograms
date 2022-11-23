package recur;

public class removingrepeaters {
	static boolean a[]=new boolean[26];
	static void a(String s,int idx,String n) {
		if(idx==s.length()) {
			System.out.println(n);
			return;
		}
		char curchar=s.charAt(idx);
		if(a[curchar-'a']==true) {
			a(s,idx+1,n);
			return;
		}
		else {
			a[curchar-'a']=true;
			n=n+curchar;
			a(s,idx+1,n);
			return;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        a("axabxbcxcdxdexe",0,"");
	}

}
