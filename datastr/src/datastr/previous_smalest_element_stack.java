package datastr;

import java.util.Stack;

public class previous_smalest_element_stack {
	public static void nearest(int arr[]) {
		Stack<Integer> a = new Stack<>();
		for (int i = 0; i < arr.length; i++) {
			while (!a.isEmpty() && a.peek() > arr[i]) {
				a.pop();
			}
			if (a.isEmpty()) {
				System.out.print(-1+" ");
			} else {
				System.out.print(a.peek()+" ");
			}
			a.push(arr[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 4, 10, 5, 8, 20, 15, 3, 12 };
		nearest(arr);
	}

}
