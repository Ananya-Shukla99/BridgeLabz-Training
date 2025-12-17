//Calculating Profit Loss 
public class ProfitLossCalculation{
	public static void main(String []args)
	{
		//Taking inputs
		int costPrice= 129;
		int sellingPrice= 191;
		
		//calculating profit
		int profit=sellingPrice-costPrice;
		double profitPercentage=((double)profit / costPrice) * 100;
		
		//Printing costPrice and sellingPrice
		System.out.println("The Cost Price is INR " +costPrice+" and Selling Price is INR "+sellingPrice +"\nThe Profit is INR "+ profit +" and the Profit Percentage is "+profitPercentage);
	}
}
