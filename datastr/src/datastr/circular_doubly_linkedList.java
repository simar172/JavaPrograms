package datastr;

import datastr.circular_doubly_linkedList.Noode;

class cdll {
	public Noode head;
	public Noode tail;
	public int size;

	public Noode cdl(int val) {
		head = new Noode();
		Noode newnode = new Noode();
		newnode.value = val;
		head = newnode;
		tail = newnode;
		newnode.next = newnode;
		newnode.prev = newnode;
		size = 1;
		return head;

	}

	public void inserting(int val, int location) {
		Noode newnode = new Noode();
		newnode.value = val;
		if (location == 0) {
			cdl(val);
			return;
		} else if (location >= size) {
			newnode.next = head;
			newnode.prev = tail;
			tail.next = newnode;
			head.prev = newnode;
			tail = newnode;
		} else {
			Noode tempnode = head;
			int index = 0;
			while (index < location-1 ) {
				tempnode = tempnode.next;
				index++;
			}
//			System.out.print(tempnode.value);
			newnode.prev = tempnode;
			newnode.next = tempnode.next;
			tempnode.next = newnode;
			tempnode.next.prev = newnode;
		}
		size++;

	}

	public void traversal() {
		if (head != null) {
			Noode tempnode = head;
			for (int i = 0; i < size; i++) {
				System.out.print(tempnode.value);
				if (i != size - 1) {
					System.out.print("->");
				}
				tempnode = tempnode.next;
			}
		} else {
			System.out.println("not present");
		}
	}

	public void revtraversal() {
		if (head != null) {
			Noode tempnode = tail;
			for (int i = 0; i < size; i++) {
				System.out.print(tempnode.value);
				if (i != size - 1) {
					System.out.print("-<-");
				}
				tempnode = tempnode.prev;
			}
		} else {
			System.out.println("not present");
		}
	}

	public boolean searching(int val) {
		if (head != null) {
			Noode tempnode = head;
			for (int i = 0; i < size; i++) {
				if (tempnode.value == val) {
					System.out.println("found at " + i);
					return true;
				}
				tempnode = tempnode.next;
			}
		}
		System.out.println("not found");
		return false;
	}
}

public class circular_doubly_linkedList {
	static class Noode {
		public int value;
		public Noode next;
		public Noode prev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cdll b = new cdll();
//        b.cdl(1);
		b.inserting(1, 0);
		b.inserting(2, 1);
		b.inserting(3, 2);
		b.inserting(6, 1);
        b.traversal();
//        b.revtraversal();
//		b.searching(3);
//        System.out.println(b.head.next.value);
	}

}
