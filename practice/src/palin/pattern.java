package palin;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String a="simar simar simar ";
        Pattern b=Pattern.compile("[a-i]");
        Matcher c=b.matcher(a);
        while(c.find()) {
        	System.out.println(c.start()+"----"+c.group());
        }
	}

}
