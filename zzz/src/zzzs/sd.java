package zzzs;
public class sd {
	class A{
		int i=10;
	}
	class B{
		A  a1;
		int i;
	}
	class M{
	public static void main(String ar[]) {
	A a1=new A();
	B b1=new B();
	b1.a1=a1;
	a1.i=100;
	System.out.println(a1.i);
	System.out.println(b1.i);
	System.out.println(b1.a1.i);
	b1.a1.i=100;
	System.out.println(a1.i);
	}	
	}
	}
