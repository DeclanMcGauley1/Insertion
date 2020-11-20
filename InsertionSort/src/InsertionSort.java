import java.util.Arrays;
public class InsertionSort {

	public static void main(String[] args) {
		int[] toBeSorted = new int[] {2,4,6,3,5,1,7};
		int[] sorted = insertion(toBeSorted);
		System.out.println(Arrays.toString(sorted));
	}
	
	/*
	 * performs the insertion sort on the array argument
	 * 
	 * @return int[] sorted
	 */
	public static int[] insertion(int[] toBeSorted) {
		
		//loops through all the values in the list 
		for (int i = 1; i < toBeSorted.length; i++) {
			
			//takes out the value to be analysed
			int holder = toBeSorted[i];
			// finds the index of the value to the right of the given value
			int j = i - 1;
			
			//Loops through all the values lower than the given value and shifts right if they are less than 
			while (j >= 0 && toBeSorted[j] > holder) {
				toBeSorted[j + 1] = toBeSorted[j];
				j--;
			}
			//places our holder value in the gap created
			toBeSorted[j + 1] = holder;
			System.out.println(Arrays.toString(toBeSorted));
		}
		return toBeSorted;
	}
	
}
