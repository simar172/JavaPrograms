package palin;
class L{
	String i;
	int j;
	int k;
	L(String i,int j,int k){
		this.i=i;
		this.j=j;
		this.k=k;
	}
	public int hashCode() {
		int result=0;
		result=result+i.hashCode();
		result=result+Integer.toString(j).hashCode();
		result=result+Integer.toString(k).hashCode();
		return result;
	}
}

public class hashcode{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        L a1=new L("simar",10,10);
        L a2=new L("simar",11,10); 
        System.out.println(a1.hashCode());
        System.out.println(a2.hashCode());
	    System.out.println(a1.hashCode()==a2.hashCode());
	}
	}


