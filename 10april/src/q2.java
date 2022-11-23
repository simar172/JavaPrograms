
class D extends Thread{
	shared1 s1;
	D(shared1 s1){
		this.s1=s1;
	}
	public void run() {
		s1.test();
	}
}
class C extends Thread{
	shared1 s1;
	C(shared1 s1){
		this.s1=s1;
	}
	public void run() {
		s1.test2();
	}
}
public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        shared1 a1=new shared1();
        D a2=new D(a1);
        C a3=new C(a1);
        a2.start();
        a3.start();
	}

}
