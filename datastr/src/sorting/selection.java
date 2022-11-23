package sorting;

public class selection {
	public static void printa(int b[]) {
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 9, 8, 6, 7, 4, 5, 3, 2 };
		for (int i = 0; i < a.length - 1; i++) {
			int smallest = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[smallest] > a[j]) {
					smallest = j;
				}
			}
			int temp = a[smallest];
			a[smallest] = a[i];
			a[i] = temp;
		}
		printa(a);
	}

}
