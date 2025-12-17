//calculating Variable Discount
import java.util.Scanner;
public class VariableDiscountCalculation{
	public static void main(String []args)
	{
		//Taking input
	    Scanner s=new Scanner(System.in);
		System.out.println("Input fees:");
		int fees=s.nextInt();
		System.out.println("Input discount percent: ");
		int discountPercent =s.nextInt();
		
		//calculating discount
		double discount=fees*((double)10/100);
		double finalDiscountedFee=fees-discount;
		
		//Printing discount
		System.out.println(" The discount amount is INR "+discount+" and final discounted fee is INR "+finalDiscountedFee);
	}
}