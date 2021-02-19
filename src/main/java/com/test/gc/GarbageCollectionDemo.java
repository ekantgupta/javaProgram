package com.test.gc;

public class GarbageCollectionDemo {

	GarbageCollectionDemo gcd3;
	
	public static void main(String[] args) {

		GarbageCollectionDemo gcd1 = new GarbageCollectionDemo();
		GarbageCollectionDemo gcd2 = new GarbageCollectionDemo();
		// This is island of isolation in GC
		gcd1.gcd3 = gcd2;
		gcd2.gcd3 = gcd1;
		
		gcd1 = null;
		gcd2 = null;
		
		// two ways to call the garbage collection in java
		//1.
		//System.gc();
		
		//2. 
		Runtime.getRuntime().gc();
		
		System.out.println("Main method done");
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize method called...");
	}
}
