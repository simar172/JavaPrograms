package datastr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Activity1{
	String name;
	int starttime;
	int endtime;
	Activity1(String name,int starttime,int endtime){
		this.name=name;
		this.starttime=starttime;
		this.endtime=endtime;
	}
	public String getname() {
		return name;
	}
	public String setname(String name) {
		this.name=name;
		return name;
	}
	public int getstarttime() {
		return starttime;
	}
	public int setstarttime(int starttime) {
		this.starttime=starttime;
		return starttime;
	}
	public int getendtime() {
		return endtime;
	}
	public int setendtime(int endtime) {
		this.endtime=endtime;
		return endtime;
	}
	public String toString() {
		return "Activity "+ name+" startime "+starttime+" endtime "+endtime;
	}
}
class Activityselection1{
	static void selection(ArrayList<Activity> list) {
		Comparator<Activity> a=new Comparator<Activity>() {
			
			@Override
			public int compare(Activity o1, Activity o2) {
				// TODO Auto-generated method stub
				return o1.getendtime()-o2.getendtime();
			}
		};
		Collections.sort(list,a);
		Activity prev=list.get(0);
		System.out.println(" prev "+list.get(0));
		for(int i=1;i<list.size();i++) {
			Activity activity=list.get(i);
			if(activity.getstarttime()>=prev.getendtime()) {
				System.out.println(activity);
				prev=activity;
			}
		}
	}
}
public class Activity_selection_problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ArrayList<Activity> b=new ArrayList<>();
         b.add(new Activity("A1",0,6));
 		b.add(new Activity("A2",3,4));
 		b.add(new Activity("A3",1,2));
 		b.add(new Activity("A4",5,8));
 		b.add(new Activity("A5",5,7));
 		b.add(new Activity("A6",8,9));
 		Activityselection1.selection(b);
	}

}
