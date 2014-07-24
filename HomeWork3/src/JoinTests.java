import static org.junit.Assert.fail;
import java.util.Arrays;
import org.junit.Test;



public class JoinTests {

	@Test
	public void merge_test(){
		int[] arr1 = {1,5,4,23,65,32,78};
		int[] arr2 = {3,5,24,54,1,2,34,45,32};
		
		int[] expect = {1,5,4,23,65,32,78,3,24,54,2,34,45};
		
		JoinArrays a = new JoinArrays();
		 int[] res = a.merge(arr1, arr2);
		 
		 Arrays.sort(res);
		 Arrays.sort(expect);
		 
		 if(!Arrays.equals(res, expect))
			 fail("Merge method faild");
		 
		 
		 
	} 
	
	@Test
	public void iner_join_test(){
		int[] arr1 = {1,5,4,23,65,32,78};
		int[] arr2 = {3,5,24,54,1,2,34,45,32};
		
		int[] expect = {1,5,32};
		
		JoinArrays a = new JoinArrays();
		 int[] res = a.iner_join(arr1, arr2);
		 
		 Arrays.sort(res);
		 Arrays.sort(expect);
		 
		 if(!Arrays.equals(res, expect))
			 fail("Merge method faild");		
	}
	@Test
	public void outer_join_test(){
		int[] arr1 = {1,5,4,23,65,32,78};
		int[] arr2 = {3,5,24,54,1,2,34,45,32};
		
		int[] expect = {4,23,65,78,3,24,54,2,34,45};
		
		JoinArrays a = new JoinArrays();
		 int[] res = a.outer_join(arr1, arr2);
		 
		 Arrays.sort(res);
		 Arrays.sort(expect);
		 
		 if(!Arrays.equals(res, expect))
			 fail("Merge method faild");	
	}
	
	
}
