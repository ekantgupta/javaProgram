package com.test.code;

public class TestEvenFromArray {

	public static void main(String[] args) {
		
		
		int [] x = {1,2,4,6,8,11};
		
		System.out.println(tesEven(6, x, 11));
		
	}

	private static int tesEven(int X, int[] A, int N) {
		
		int result = -404;
		
		int count = 0;
		for(int i = 0; i< X; i++) {
			if(A[i] % 2 == 0) {
				if(A[i] == N) {
					break;
				}else {
					count++;
				}
			}
		}
		
		result = count;
		
		return result;
	}

}
