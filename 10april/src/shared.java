
public class shared {

	    synchronized void test() {
		Thread t= Thread.currentThread();
		int i=10;
		System.out.println(i);
		 i=20;
		System.out.println(i);
		 i=30;
		System.out.println(i);
		 i=40;
		System.out.println(i);
		i=50;
		System.out.println(i);
		i=60;
		System.out.println(i);

	}

}
