package palin;
class AB{
	int i;
	int j;
	AB(int i,int j){
		this.i=i;
		this.j=j;
	}
	public boolean equals(Object obj) {
		AB a1=(AB)obj;
		return i==a1.i;
				} 
}
public class hack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    AB a1=new AB(10,11);
    AB a2=new AB(10,15);
    System.out.println(a1.equals(a2));
	}

}

//
//import java.util.Scanner;
//
//public class hack {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		 Scanner s=new Scanner(System.in);
//	       String n=s.nextLine();
//	       String a1[]=n.split("\\s");
//	       String f="";
//	       for(int i=0;i<a1.length;i++) {
//	    	   for(int j=1;j<a1.length;j++) {
//	    	   if(a1.charAt[i]==a1.charAt[j]){
//	    		 String g=a1[i].replaceAll(a1[j]," ");
//	    		 f=f+g;
//	    		   System.out.println(f);
//	    	   }
//	    	   System.out.println(f);
//	       }
//	    	   }
//
//}
//	}
