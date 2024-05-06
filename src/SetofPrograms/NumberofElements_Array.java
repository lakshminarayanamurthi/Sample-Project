package SetofPrograms;

public class NumberofElements_Array {

	public static void main(String[] args) {
		int sum=0;
		int[]array= {10,20,30,40,50};
		int length=array.length;
		System.out.println("Array length is "+length);
		for(int num:array) {
			sum+=num;
			
		}
		System.out.println("adding elements is: "+sum);
		

	}

}

