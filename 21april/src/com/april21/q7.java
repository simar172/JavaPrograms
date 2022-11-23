package com.april21;
class M{
	M(){
		System.out.println("default");
	}
	M(int i){
		System.out.println("parameteric");
	}
}
interface A6{
	M test();
}
interface A7{
	M test(int i);
}
public class q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        A6 a1=M::new;
        a1.test();
        A7 a2=M::new;
        a2.test(0);
	}

}
