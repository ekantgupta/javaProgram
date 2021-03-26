
public class TestNumber {

	public static void main(String[] args) {
		
		int[] intArray = {15, 17, 18, 20, 23, 27, 30, 32, 35, 40};
		
		printMissingNumber(intArray);
		
	}

	private static void printMissingNumber(int[] intArray) {
		for(int i = 0; i< intArray.length; i++) {
			if(i < intArray.length -1 ) {
				int diff = (intArray[i+1] - intArray[i]) -1;
			
				for(int j = 0; j < diff; j++) {
					System.out.println(intArray[i] + (j+1));
				}
			}
			
			
		}
	}

}
