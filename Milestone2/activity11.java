package Milestone2;

public class activity11 {
	public static void main(String[] args) {
		int length_ratio=3;
		int breadth_ratio=2;
		int speed=12;
		int time_taken_to_complete_1_round=8;
		double speed_after_conversion=(speed*1000)/60;
		int perimeter=(int) (time_taken_to_complete_1_round*speed_after_conversion);
		int p=(length_ratio+breadth_ratio)*2;
		int ratio=perimeter/p;
		int newLength=length_ratio*ratio;
		int newBreadth=breadth_ratio*ratio;
		int area=newLength*newBreadth;
		
		System.out.println("Area is= "+area);
		
	}
}
