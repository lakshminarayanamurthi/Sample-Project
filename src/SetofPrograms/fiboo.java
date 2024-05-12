package SetofPrograms;

public class fiboo {

	public static void main(String[] args) {
		int n=10,firstterm = 0, secondterm = 1;
		System.out.println("Fibonacci series "+n+"terms:");
		for(int i=1;i<=n;i++) {
			System.out.print(firstterm+" ,");
			int nextterm=firstterm+secondterm;
			firstterm=secondterm;
			secondterm=nextterm;
			//System.out.println("printing"+nextterm);
		}

	}

}
