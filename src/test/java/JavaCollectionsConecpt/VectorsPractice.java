package JavaCollectionsConecpt;

import java.util.Vector;

public class VectorsPractice {
	
	public static void main(String[] args) {
		
		
		
		Vector v1 = new Vector();
		
		v1.add("Ramesh");
		v1.add("Pawan"); //appends given value at end
		v1.add(0,"Naresh");  //add given value at specified index
		v1.add("Lokesh");
		
		
		System.out.println(v1);  //prints whole  vector elements
		
	}

}
