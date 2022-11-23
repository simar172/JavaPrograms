package com.feb24;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String a="abcabc";
        Pattern p1=Pattern.compile("ab");
        Matcher m1=p1.matcher(a);
        while(m1.find()) {
        	System.out.println(m1.start()+"------"+m1.group());
        }
	}

}
