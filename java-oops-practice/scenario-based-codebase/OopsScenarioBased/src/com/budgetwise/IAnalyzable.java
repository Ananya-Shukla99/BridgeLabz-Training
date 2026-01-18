package com.budgetwise;

public interface IAnalyzable {

	void generateReport(Transaction []arr);
	void detectOverspend(Transaction []arr);
}
