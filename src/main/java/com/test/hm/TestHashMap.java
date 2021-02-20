package com.test.hm;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {

	public static void main(String[] args) {
		
		Account account1 = new Account(1, "Saving", "Ekant");
		Account account2 = new Account(2, "Saving", "Vikrant");
		Account account3 = new Account(3, "Current", "Lovlesh");
		
		Map<Account, String> map = new HashMap<>();
		
		map.put(account1, "Account_one");
		map.put(account2, "Account_Two");
		map.put(account3, "Account_Three");
		
		account1.setAccountHolderName("Amit");
		account2.setAccountType("Current");
		
		System.out.println(map.get(account1));
		System.out.println(map.get(account2));
		System.out.println(map.get(account3));
		
		Account account4 = new Account(1, "Saving", "Sumit");
		//map.put(account4, "Account_Four");
		
		System.out.println(map.get(account4));
		
//		outPut
//		Account_one
//		Account_Two
//		Account_Three
//		Account_one
	}

}
