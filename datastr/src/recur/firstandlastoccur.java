package recur;

public class firstandlastoccur {
	public static int first=-1;
	public static int last=-1;
	static void  rec(String str,int idx,char element) {
		if(idx==str.length()) {
			System.out.println(first);
			System.out.println(last);
			return;
		}
		char curchar=str.charAt(idx);
		if(curchar==element) {
			if(first==-1) {
				first=idx;
			}
			else {
				last=idx;
			}
		}
		rec(str,idx+1,element);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        rec("bcadbacbada",0,'d');
	}

}
