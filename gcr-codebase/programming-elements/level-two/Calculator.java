// a basic calculator program
import java.util.Scanner;
public class Calculator{
	public static void main(String []args)
	{
		//Taking input
	    Scanner s=new Scanner(System.in);
		System.out.println("Num1 :");
		float num1=s.nextInt();
		System.out.println("Num2 :");
		float num2 =s.nextInt();
		
		//Calculation
		float add=num1+num2;
		float sub=num1-num2;
		float mul=num1*num2;
		float division=(num1>num2)?num1/num2:num2/num1;
		
		//Printing discount
		System.out.println( "The addition, subtraction, multiplication and division value of 2 numbers "+num1+" and "+num2+" is "+add+","+sub+","+mul+", and "+division);
		s.close();
	}
}
