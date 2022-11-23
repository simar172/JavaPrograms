package parcel;

import java.util.*;

public class vowels {

	

	static void vow(String arr[]) {
		ArrayList<String> ans = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			char s = arr[i].charAt(0);
			char e = arr[i].charAt(arr[i].length()-1);
			if ((s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u')
					&& (e == 'a' || e == 'e' || e == 'i' || e == 'o' || e == 'u')) {
                 ans.add(arr[i]);
			}
		}
		System.out.println(ans);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String arr[] = new String[n];
		for (int i = 0; i < n; i++) {
			arr[i] = s.next();
		}
		vow(arr);
	}
}
