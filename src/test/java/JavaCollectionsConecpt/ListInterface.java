package JavaCollectionsConecpt;

import java.util.*;

public class ListInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String> s1 = new ArrayList<String>();
		
		s1.add("Sreenu");
		s1.add("Ravinda");
		s1.add("Jeevan");
		s1.add("Sumanth");
		
		System.out.println(s1);
		System.out.println(s1.get(2));
		
		
		for(String x:s1) {
			System.out.println(x+"------------");
		}
		
		s1.addAll(s1);
		System.out.println(s1);
		s1.remove(2);
		System.out.println(s1);
		
		Iterator<String> i1 = s1.iterator();
		System.out.println(i1.next()+ "   ---  "+i1.hasNext() );
		
		
		String[] arr = new String[s1.size()];
		
		s1.toArray(arr);
		
		for(String x:arr) {
			System.out.println(x+"------------");
		}
		
		
	s1.remove("Sreenu");
	s1.set(0,"Alfa Romeo");
	s1.set(0,"Ferrari");
	s1.add(1, "Supra");
	System.out.println(s1.indexOf("Supra"));
	System.out.println(s1.isEmpty());
	System.out.println(s1.contains("Supra"));
	System.out.println(s1);
	s1.sort(Comparator.naturalOrder());
	System.out.println(s1);
	s1.sort(Comparator.reverseOrder());
	System.out.println(s1);
//	s1.removeAll(s1);
	s1.clear();
	System.out.println(s1);
	System.out.println(s1.size());
	}

}
