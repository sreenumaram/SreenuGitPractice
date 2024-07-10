package JavaCollectionsConecpt;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, String> students = new HashMap<String, String>();
		
		students.put("ECE", "Sreenu");
		students.put("CSE", "Vidya");
		students.put("Civil", "Teja");
		
		
Map<String, String> sub = new HashMap<String, String>();
		
		students.put("m1", "100");
		students.put("edc", "80");
		students.put("es", "80");
		System.out.println(students);
		
		students.putAll(sub);

		
		System.out.println(students);
		students.putIfAbsent("m2", "90");   //if m2 already present it will not add , if not present it will add.
		System.out.println(students);
		System.out.println(students.get("m2"));
		System.out.println(students.getOrDefault("ss", "given key is not available"));
		System.out.println(students.containsKey("edc"));
		students.replace("edc","220");
		System.out.println(students.get("edc"));
		System.out.println(students.entrySet());
		students.put("cs", "220");

		
		 for (Map.Entry<String, String> entry : students.entrySet()) {
	            String key = entry.getKey();
	            String value = entry.getValue();
	            System.out.println("Key: " + key + ", Value: " + value);
	        }
		  System.out.println("Keys: " + students.keySet());
		  System.out.println("Values: " + students.values());
		  
		  
		
	}
	
	

}
