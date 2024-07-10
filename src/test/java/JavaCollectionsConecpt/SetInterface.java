package JavaCollectionsConecpt;

import java.util.HashSet;
import java.util.Set;

public class SetInterface {
	public static void main(String[] args) {
		
		
		Set<Integer> rollNum = new HashSet<Integer>();
		
		rollNum.add(415);
		rollNum.add(425);
		rollNum.add(433);
		rollNum.add(441);
		rollNum.add(455);
		
		System.out.println(rollNum);
		

		Set<Integer> roll2 = new HashSet<Integer>();
		
		roll2.add(4150);
		roll2.add(425);
		roll2.add(433);
		roll2.add(4410);
		roll2.add(4550);
		System.out.println(roll2);
		
		rollNum.addAll(roll2);
		System.out.println(rollNum);
		
		rollNum.remove(425);
		System.out.println(rollNum);
		
//		rollNum.retainAll(roll2);
//		System.out.println(rollNum+"-------------");
		
		
		rollNum.removeAll(roll2);
		System.out.println(rollNum);
		
		
		
		
	}

}
