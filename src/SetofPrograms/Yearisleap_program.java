package SetofPrograms;

public class Yearisleap_program {

	public static void main(String[] args) {
		/*Double first=2.5, second=4.5;
		double product=first*second;
		System.out.println("product is "+product);*/
		
		 int year = 2025;

		 if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
		 //if((year%4==0)&&(year%100!=0))||(year%400==0))
		 {

		 System.out.println(year + " is a leap year");

		 } else {

		 System.out.println(year + "is not a leap year");

		 }

	}

}
