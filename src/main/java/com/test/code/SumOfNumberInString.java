package com.test.code;

/**
 * 
 * @author Ekant
 *
 */
public class SumOfNumberInString {

	/**
	 * This class with add all the numbers present in String. For Example : Give
	 * input if : sd30fs5 Then out must be : 35 (30 + 5)
	 * 
	 * @param data
	 */
	public void sumOfNumInString(String data) {
		int sum = 0;
		String val = "0";

		for (int i = 0; i < data.length(); i++) {
			int value = data.codePointAt(i);

			// Ascii Value of 0 to 9 is 48 to 57. We need to check condition for the same.

			if (value >= 48 && value <= 57) {
				val += Character.toChars(value)[0] + "";
			} else {
				sum += Integer.parseInt(val);
				val = "0";

			}

		}
		sum += Integer.parseInt(val);
		System.out.println("Result : " + sum);

	}
	
	/**
	 * We need to add the character ascii number from the given string
	 * For example:
	 * Input is : AB34cd
	 * output must Be : 65+66+99+100 = 330
	 * @param data
	 */
	public void sumOfCharterAsciiNumber(String data) {
		int sum = 0;
		
		for(int i = 0; i < data.length(); i++) {
			int val = data.codePointAt(i);
			
			if((val >= 65 && val <= 90) || (val >= 97 && val <= 122))
				sum += val;
		}
		
		System.out.println("Result : " + sum);
	}

}
