package com.test.code;

import java.util.HashMap;
import java.util.Map;

/**
 *  
 * @author Ekant
 *
 */
public class SearchRepeatedChar {
	
	/**
	 * This method will find the recurring characters from the given string and print those recurring character in console. 
	 * For Example: 
	 * If your input String is : ABCDEADB 
	 * Then output must be this : ABD
	 * 
	 * @param data
	 */
	public void findRepeatedCharacter(String data) {
		
		Map<Character, Integer> repeatedCharMap = new HashMap<>();
		repeatedCharMap.put(data.charAt(0), 1);
		
		for(int i = 1; i < data.length(); i++) {
			if(repeatedCharMap.containsKey(data.charAt(i)))
				repeatedCharMap.put(data.charAt(i), 2);
			else
				repeatedCharMap.put(data.charAt(i), 1);
		}
		
		System.out.println(repeatedCharMap.toString());
		String result = "";
		for(Map.Entry<Character, Integer> entry : repeatedCharMap.entrySet()) {
			
			if(entry.getValue() > 1)
				result += entry.getKey();
			
		}
		
		System.out.println("Final result : " + result);
		
	}
	
	/**
	 * This method will find the recurring characters from the given string and print those recurring character in console. 
	 * For Example: 
	 * If your input String is : ABCDEADB 
	 * Then output must be this : {A=2, B=2, C=1, D=2, E=1}
	 * 
	 * @param data
	 */
	public void printRepeatedCharacterNumber(String data) {
		Map<Character, Integer> repeactedMap = new HashMap<>();
		repeactedMap.put(data.charAt(0), 1);
		
		for(int i = 1; i < data.length(); i++) {
			if(repeactedMap.containsKey(data.charAt(i))) 
				repeactedMap.put(data.charAt(i), repeactedMap.get(data.charAt(i)) + 1);
			else
				repeactedMap.put(data.charAt(i), 1);
		}
		
		System.out.println("Result : " + repeactedMap.toString());
	}

}
