package datastr;

import java.util.*;

public class greatest_number {
	 public String largestNumber(int[] nums) {
		 Arrays.sort(nums);
		  if((""+nums[0]).equals("0")){
	            return "0";
	        }
		ArrayList<String> a=new ArrayList<String>();
		for(int i=0;i<nums.length;i++) {
			a.add(""+nums[i]);
		}
		
		Collections.sort(a,new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				// TODO Auto-generated method stub
				String ab=o1+o2;
				String ba=o2+o1;
				 return ab.compareTo(ba) > 0 ? -1 : 1;
//				return 0;
			}
		});
		Object b="";
		 Iterator it=a.iterator();
		 while(it.hasNext()) {
			 b=it.next().toString()+b;
		 }return b.toString();
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
