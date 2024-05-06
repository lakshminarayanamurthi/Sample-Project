package SetofPrograms;

public class Overloading_Program {
	static int Multiply(int a, int b) {
		
		return a*b;
		
	}
	static int Multiply(int a, int b, int c) {
		
		return a*b*c;
		
	}
	static int Multiply(int a, int b, int c, int d) {
	
	return a*b*c*d;
	
}

	public static void main(String[] args) {
		System.out.println("Multiply 2 parameters");
		System.out.println(Multiply(4,3));
		System.out.println("Multiply 3 parameters");
		System.out.println(Multiply(4,3,2));
		System.out.println("Multiply 4 parameters");
		System.out.println(Multiply(4,3,5,3));
	}

}
