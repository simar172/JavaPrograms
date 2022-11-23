package hw;

public class inp {

	public static void sum(int st, int ed) {
		int sum = 0;
		for (int i = st; i <= ed; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

	public static void prod(double num) {
		double prod = 1;
		for (double i = 1; i < num; i = i + 0.2) {
			prod = prod * i;
		}
		System.out.println(prod);
	}

	public static void sum_num(int num) {
		String n = num + "";
		for (int i = 0; i < n.length(); i++) {
			if (n.charAt(i) % 2 != 0) {
				System.out.print(n.charAt(i) + " ");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum(2, 10);
		prod(10);
		sum_num(354237);
	}

}
