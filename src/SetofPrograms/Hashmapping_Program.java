package SetofPrograms;

import java.util.HashMap;
import java.util.Map;

public class Hashmapping_Program {

	public static void main(String[] args) {
		HashMap<Integer,String> hs=new HashMap<>();
		hs.put(101,"Rama");
		hs.put(102, "Laxmana");
		hs.put(103, "Anjeneya");
		System.out.println(hs);
		//remove a pair from hashmap
		hs.remove(102);
		System.out.println(hs);
		//Reading single pair
		System.out.println(hs.get(103));
		
		//Reading keys,values from Hashmap
		for(Map.Entry m:hs.entrySet()) {
			System.out.println(m.getKey()+""+m.getValue());
		}
	}

}
