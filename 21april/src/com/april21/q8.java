package com.april21;
class M1{
	M1(){
		System.out.println("default");
	}
	M1(int i){
		System.out.println("parametric");
	}
}
class M2{
	void add(int i) {
		System.out.println("add");
	}
}

interface A8{
	M1 test(int i);
	
}
interface A9{
	M2 test();
}
public class q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        A8 a1=M1::new;
        a1.test(1);
        A9 a2=M2::new;
        a2.test();
	}

}
