package SetofPrograms;

public class AscendingorderusingArray {

	public static void main(String[] args) {
		int[]array= {2,4,5,6,3,7,8,4};
		/*
		 * Arrays.sort(array);
		 * System.out.println("Sorting order is "+Arrays.toString(array));
		 */
		for(int i=0;i<array.length;i++) {
			for(int j=i+0;j<array.length;j++) {
				int temp=0;
				if(array[j]<array[i]) {
					temp=array[i];
					array[j]=array[i];
					array[j]=temp;
					
				}
				System.out.println(array[j]+" ");
			}
			
		}
	}

}
