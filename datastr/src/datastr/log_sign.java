package datastr;

import java.util.*;

public class log_sign {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		HashMap<String, String> ar = new HashMap<>();
		System.out.println("What do you want to do");
		String yn = s.next();
		if(yn.equals("y")) {
		System.out.println("Signing up");
		System.out.println("Enter username");
		String u = s.next();
		System.out.println("Enter password. Your password must Contains uppercase and lowercase letters,character,numbers ");
		String p = s.next();
		
			if (!ar.containsKey(u) && p.contains("^(?=.{5,10}$)(?!.*[._-]{2})[a-z][a-z0-9._-]*[a-z0-9]$")) {
				ar.put(u, p);
				System.out.println("add success");
			} 
		
		}
	
		System.out.println("Enter Login details");
		String u1=s.next();
		String p1=s.next();
		if(ar.containsKey(u1) && ar.containsValue(p1)) {
			System.out.println("login");
		}
		else {
			System.out.println("Error ");
		}
		}
		
		
	}

