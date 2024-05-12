package SetofPrograms;

public class StringExample {

	public static void main(String[] args) {
		String str="Good News";
		StringBuilder sb=new StringBuilder(str);
		//sb.append(str);
		sb.reverse();
		System.out.println("Reverse string is "+sb);

	}

}
