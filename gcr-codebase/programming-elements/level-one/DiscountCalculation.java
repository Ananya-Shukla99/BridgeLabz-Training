//Discount calculation program
public class DiscountCalculation{
	public static void main(String []args)
{
	//Providing input
	int fees=125000;
	int discountPercent =10;
	
	//Calculating discount
	double discount=fees*((double)10/100);
	double finalDiscountedFee=fees-discount;
		
	//Printing discount and finalDiscountedFee
	System.out.println(" The discount amount is INR "+discount+" and final discounted fee is INR "+finalDiscountedFee);
	}
}