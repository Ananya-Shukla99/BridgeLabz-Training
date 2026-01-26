package com.annotation.cacheresult;

public class Main {
	public static void main(String[] args) throws Exception {
		MathOperations math = new MathOperations();

		System.out.println("Factorial of 5: " + CacheHandler.invokeWithCache(math, "factorial", 5));
		System.out.println("Factorial of 5: " + CacheHandler.invokeWithCache(math, "factorial", 5)); // Should return
																										// cached
		System.out.println("Factorial of 6: " + CacheHandler.invokeWithCache(math, "factorial", 6)); // New computation
	}
}
