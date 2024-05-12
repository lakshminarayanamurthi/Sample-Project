package SetofPrograms;

public class reverse {

	public static void main(String[] args) {
		String sr="Good Luck";
		String rev="";
		char ch;
		for(int i=0;i<sr.length();i++) {
			//rev=sr.charAt(i)+rev;
			ch=sr.charAt(i);
			System.out.println(ch);
			rev=ch+rev;
			//System.out.println("Reverse string is: "+rev);
		}
		System.out.println("Reverse string is: "+rev);

	}

}
