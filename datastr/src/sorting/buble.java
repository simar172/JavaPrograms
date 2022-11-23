package sorting;

//shifting largest number int the end
public class buble {
	public static void printa(int b[]) {
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 3, 2, 4, 6, 5 };
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		printa(a);
	}

}
