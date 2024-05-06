package SetofPrograms;

public class Reversestring {

	public static void main(String[] args) {
		String str="Good News";
		String rev=" ";
		//String[]words=str.split(" ");
		for(int i=0;i<str.length()-1;i++) {
			rev=str.charAt(i)+rev;
			System.out.println("reverse string is "+rev);
		}
	
	}

}
