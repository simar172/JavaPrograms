package datastr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class overlapping_intervals {
	public static void overlappedInterval(int[][] Intervals)
    {
      
        // Code here // Code here
		 Arrays.sort(Intervals,(arr1,arr2)->Integer.compare(arr1[0],arr2[0]));
		List<int[]> out=new ArrayList<>();
		int current_interval[]=Intervals[0];
		out.add(current_interval);
		for(int interval[]:Intervals) {
			int current_begin=current_interval[0];
			int current_end=current_interval[1];
			int next_begin=interval[0];
			int next_end=interval[1];
			if(current_end>=next_begin) {
				current_interval[1]=Math.max(next_end, current_end);
			}else {
				current_interval=interval;
				out.add(current_interval);
			}
		}
		for(int i=0;i<out.size();i++) {
			System.out.println(out.get(i));
		}
		
		}
//	return out.toArray(new int[out.size()][]);
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Intervals[][] = {{1,3},{2,4},{6,8},{9,10}};
		overlappedInterval(Intervals);
	}

}
