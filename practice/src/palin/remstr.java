package palin;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class remstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="abcabc das abcabc";
		String b[]=a.split(" ");
		for(int i=0;i<b.length;i++) {
        Pattern p1=Pattern.compile(b[i]);
        
        Matcher m1=p1.matcher(a);
        while(m1.find()) {
        	System.out.println(m1.start()+"------"+m1.group());
        }}
	}

}
