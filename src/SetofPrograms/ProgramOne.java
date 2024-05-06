package SetofPrograms;

public class ProgramOne {

	public static void main(String[] args) {
		String one="Hello World";
		String two="Hello World";
		String three="Output";
	    //string print
		System.out.println(one);
	    System.out.println(two);
	    System.out.println(three);
	    //String length
	    int length=one.length();
	    System.out.println("Length:- "  + length);
	    //Join two strings
	    String joinedstring=one.concat(three);
	    System.out.println("Joined string is: -"+joinedstring);
	    boolean result1=one.equals(three);
	    System.out.println("String first and three are equal:- "+result1);
	    boolean result2=one.equals(two);
	    System.out.println("String first and second are equal:- "+result2);
	    
		/*
		 * String rev=""; for(int i=0;i<one.length()-1;i--); { rev=rev.charAt(i);
		 * System.out.println("Reverse string is: -"+rev); }
		 */
	    	
	    	
	    
	    
	
	
	}

}
