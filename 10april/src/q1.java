class A extends Thread{
    shared s1; 
    A(shared s1){
    	this.s1=s1;
    }
	public void run() {
    	 s1.test();
     }
}
class B extends Thread{
	shared s1;
	B(shared s1){
		this.s1=s1;
	}
	public void run() {
		s1.test();
	}
}
public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        shared s1=new shared();
		A a1=new A(s1);
        B a2=new B(s1);
        a1.start();
        a2.start();
	}

}
