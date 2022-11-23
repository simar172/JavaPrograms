
public class shared1 {
    Thread t=Thread.currentThread();
	void test() {
		for(int i=0;i<2000;i++) {
			System.out.println("simple"+i);
		}}
		synchronized void test1() {
			for(int i=0;i<2000;i++) {
				System.out.println("synch "+i);
			}}
			synchronized void test2() {
				for(int i=0;i<2000;i++) {
					System.out.println("synch1 "+i);
				
	}

}}
