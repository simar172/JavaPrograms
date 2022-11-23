package calculator;
import java.util.Scanner;
public class markss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter marks");
		float tmarks=300;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter marks get in physics");
	    float phy=sc.nextFloat();
		System.out.println("enter marks get in math");
		float math=sc.nextFloat();
		System.out.println("enter marks get in chemistry");
        float che=sc.nextFloat();
        float pc=((phy+math+che)/tmarks)*100;
        System.out.println("percentage is" +pc+"%");
	}

}
