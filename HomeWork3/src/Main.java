
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int[] arr1 = {1,5,4,23,65,32,78};
		int[] arr2 = {3,5,24,54,1,2,34,45,32};
		
		JoinArrays j = new JoinArrays();
		
		
		
		System.out.println("merge res: ");
		j.print(j.merge(arr1, arr2));
		
		System.out.println("iner_join res: ");
		j.print(j.iner_join(arr1, arr2));
		
		System.out.println("outer_join res: ");
		j.print(j.outer_join(arr1, arr2));
		

		

	}

}
