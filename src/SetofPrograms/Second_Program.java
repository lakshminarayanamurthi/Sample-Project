package SetofPrograms;

public class Second_Program {

	public static void main(String[] args) {
		int num1=10, num2=20, sum, max;
		//addition
		sum=num1+num2;
		System.out.println("Addition is:- "+sum);
		//Max number logic
		max = (num1 > num2) ? (num1 > sum ? num1 : sum) : (num2 > sum ? num2 : sum);
		System.out.println("max is "+max);
				
		

	}

}
