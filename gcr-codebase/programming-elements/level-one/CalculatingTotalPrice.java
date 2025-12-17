//calculating the total price
import java.util.Scanner;
public class CalculatingTotalPrice
{
	public static void main(String[]agrs)
	{
	    //Taking input
		Scanner input=new Scanner(System.in);
		double unitPrice=input.nextDouble();
		int quantity =input.nextInt();
		
		//Calculating Total Price
		double TotalPrice = quantity*unitPrice;
		System.out.println("The total purchase price is INR "+TotalPrice+" if the quantity "+quantity+" and unit price is INR "+unitPrice);
	}
}