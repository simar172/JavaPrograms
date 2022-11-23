package datastr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Activity{
	String name;
	int starttime;
	int endtime;
	Activity(String name,int starttime,int endtime){
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
	public int setstarttime() {
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
		return "Activity "+name+" starttime "+starttime+" endtime "+endtime;
	}
}
class Activityselection{
	static void selection(ArrayList<Activity> list) {
		Comparator<Activity> l1=new Comparator<Activity>() {
			
			@Override
			public int compare(Activity o1, Activity o2) {
				// TODO Auto-generated method stub
				return o1.getendtime()-o2.getendtime();
			}
		};
		Collections.sort(list,l1);
		Activity prev=list.get(0);
		System.out.println("first "+prev);
		for(int i=1;i<list.size();i++) {
			Activity activity=list.get(i);
			if(activity.getstarttime()>=prev.getendtime()) {
				System.out.println( activity );
				prev=activity;
			}
		}
	}
}
public class activity_selection_problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Activity> b=new ArrayList();
		b.add(new Activity("A1",0,6));
		b.add(new Activity("A2",3,4));
		b.add(new Activity("A1",1,2));
		b.add(new Activity("A1",5,8));
		b.add(new Activity("A1",5,7));
		b.add(new Activity("A1",8,9));
		Activityselection.selection(b);
		
	}

}
