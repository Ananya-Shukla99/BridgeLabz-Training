//find the maximum number of handshakes
import java.util.Scanner;
public class MaximumNumberOfHandshakes
{
	public static void main(String []args)
	{
		//Taking input
		Scanner input=new Scanner(System.in);
		int numberOfStudents =input.nextInt();
		
		//Calculation
		int handshakes=(numberOfStudents * (numberOfStudents - 1)) / 2;
		
		//Printing possible handshakes
		System.out.println("The number of handshakes is "+handshakes+" where number of students is "+numberOfStudents);
	}
}