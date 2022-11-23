package datastr;

import java.util.Scanner;

public class clg_qs {

	public static void array(int n, int d, int st) {

		int ans[] = new int[n];
		for (int i = 0; i < n; i++) {
			ans[i] = st;
			st += d;
		}

		for (int i = 0; i < n; i++) {
			System.out.println(ans[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		if (n >= 100000 || n<=0) {
			System.out.println("invalid length");
			return;
		}
		int d = s.nextInt();
		int st = s.nextInt();

		array(n, d, st);

	}

}
