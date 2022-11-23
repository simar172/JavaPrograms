package palin;

import java.util.Collections;
import java.util.PriorityQueue;

public class median {
	static PriorityQueue<Integer> maxheap=new PriorityQueue<>(Collections.reverseOrder());
	static PriorityQueue<Integer> minheap=new PriorityQueue<>(Collections.reverseOrder());
	public static void insertnum(int a) {
		if(maxheap.isEmpty() || maxheap.peek()>a) {
			maxheap.add(a);
		}
		else {
			minheap.add(a);
		}
		
		if(maxheap.size()>minheap.size()+1) {
			minheap.add(maxheap.poll());
		}
		else if(minheap.size()>maxheap.size()) {
			maxheap.add(minheap.poll());
		}
	}
	public static int median() {
		if(maxheap.size()==minheap.size()) {
			return (maxheap.peek()+minheap.peek())/2;
		}
		return maxheap.peek();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		insertnum(1);
		insertnum(3);
		System.out.println(median());
        
	}

}
