
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int[] arr1 = {1,5,4,23,65,32,78};
		int[] arr2 = {3,5,24,54,1,2,34,45,32};

        //local code review (vtegza): name classes more descriptive @ 27.07.14
        JoinArrays j = new JoinArrays();
		
		
		
		System.out.println("merge res: ");
        //local code review (vtegza): extract variables to indicate code more explanatory @ 27.07.14
        int[] mergedArray = j.merge(arr1, arr2);
        j.print(mergedArray);
		
		System.out.println("iner_join res: ");
		j.print(j.iner_join(arr1, arr2));
		
		System.out.println("outer_join res: ");
		j.print(j.outer_join(arr1, arr2));
		

		

	}

}
