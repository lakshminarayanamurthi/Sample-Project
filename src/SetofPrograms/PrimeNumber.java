package SetofPrograms;

public class PrimeNumber {
	static boolean isPrime(int n) {
		if(n<=1) {
			
			return false;}
			for(int i=2;i<n;i++) {
				if(n%i==0) {
					return false;
		
			}
			
		
				
	
			}
			return true;
	}

	public static void main(String[] args) {
		if (isPrime(11)) {
			System.out.println("Prime number");
		}
		else
				System.out.println("not prime number");
			
		if (isPrime(15)) {
			System.out.println("Prime number");
		}
		else
				System.out.println("not prime number");
			
			
		}
	}


