package SetofPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Practise {
	
	
	 
	public static void main(String[] args) {
		Map<Integer,String>ms=new HashMap<Integer,String>();
		ms.put(111, "One Record");
		ms.put(112, "Two Record");
		ms.put(113, "Third Record");
		ms.put(114, "Fourth Record");
		System.out.println("All records"+ms);
		
		ms.remove(111);
		System.out.println("After Removed records"+ms);
		//reading single pair
		System.out.println(ms.get(112));
		//reading key,values in hashmap
		for(Entry m:ms.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	}
	
		
		}
	
		
		
	
	
