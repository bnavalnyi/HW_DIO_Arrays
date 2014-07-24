
public class JoinArrays {
	
	public int[] merge(int arr1[], int arr2[]){

		int [] tmp = new int [arr1.length + arr2.length];
		int count = 0;

		for(int item1 : arr1){
			tmp[count] = item1;
			count++;
		}
		
		
		for(int i=0;i<arr2.length;tmp[count] = arr2[i],count++,i++){
			for(int j=0;j<arr1.length;j++)
				if(arr2[i]==arr1[j]){
					i++;
					break;
				}
			if(i==arr2.length)
				break;
		}
		
		int[] res = new int[count];
		
		for(int i=0;i<res.length;i++)
			res[i] = tmp[i];

		return res;
	}
	public int[] iner_join(int []arr1,int[] arr2) {
		int[] tmp = new int [arr1.length + arr2.length];
		int count = 0;
		
		for(int item1:arr1)
			for(int item2:arr2)
				if(item1 == item2){
					tmp[count] = item1;
					count++;
					break;
				}
		
		int[] res = new int[count];
		for(int i=0;i<res.length;i++)
			res[i] = tmp[i];
		
		return res;
		
	}
	public int[] outer_join(int[] arr1, int[] arr2) {
		int[] tmp = new int[arr1.length + arr2.length];
		int count = 0;
		int i= 0,k = 0;

		for (;i < arr1.length;i++) {
			for (int j =0; j < arr2.length;j++) {
				if (arr1[i] == arr2[j]){
					break;
				}
					else
						k++;

				}
			if (k == arr2.length) {
				tmp[count] = arr1[i];
				count++;
				k=0;
			}
			k=0;

			}
			
		
		i=0;
		k=0;
		for (;i < arr2.length;i++) {
			for (int j =0; j < arr1.length;j++) {
				if (arr2[i] == arr1[j]){
					break;
				}
					else
						k++;

				}
			if (k == arr1.length) {
				tmp[count] = arr2[i];
				count++;
				k=0;
			}
			k=0;

			}	
		
		int[] res = new int[count];
		
		for(int f=0;f<res.length;f++)
			res[f] = tmp[f];
		
		
		return res;
	}

	public void print(int[] arr){
		System.out.println("");
		for(int item:arr)
			System.out.print(item + " ");
		System.out.println("");
	}



}
