package datastr;

public class Egyptian_Fraction {
	public static void frac(int nr,int dr) {
		if(nr==0 || dr==0) {
			return;
		}
		if(nr%dr==0) {
			System.out.print(nr/dr);
			return;
		}
		if(dr%nr==0) {
			System.out.print("1 / "+dr/nr);
			return;
		}
		if(nr>dr) {
			System.out.print(dr/nr+"+");
			frac(nr%dr,dr);
			return;
		}
		int n=dr/nr+1;
		System.out.print("1/"+n+"+");
		
		frac(nr*n-dr,dr*n);
	}
	
	
	public static void main(String[] args) {
     frac(6, 14);  
	}
}
