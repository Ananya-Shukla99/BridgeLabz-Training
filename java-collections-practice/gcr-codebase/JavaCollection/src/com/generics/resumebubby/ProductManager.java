package com.generics.resumebubby;

public class ProductManager extends JobRole{

	public ProductManager(String candidateName) {
		super(candidateName);
	}

	@Override
	public void evaluateSkills() {
		System.out.println(candidateName + ": Evaluating leadership and product strategy skills.");
	}

}
