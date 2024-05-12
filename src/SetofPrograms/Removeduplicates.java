package SetofPrograms;

public class Removeduplicates {

		public static void main(String[] args) {
		String s1=new String("aaabbbccc");
		StringBuilder sb=new StringBuilder();
		/*
		 * s1.chars().distinct().forEach(c->sb.append((char) c));
		 * System.out.println(sb);
		 */
		/*---
		for(int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			int id=s1.indexOf(ch,i+1);
			if(id==-1) {
				sb.append(ch);
			}
		}
		System.out.println(sb);
		*/
		
		
	}}
