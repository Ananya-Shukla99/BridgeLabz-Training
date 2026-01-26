package com.annotation.cacheresult;

public class MathOperations {

	@CacheResult
	public long factorial(int n) {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		if (n <= 1)
			return 1;
		return n * factorial(n - 1);
	}
}
