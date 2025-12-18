//calculating BMI
import java.util.Scanner;

public class BMICalculation
{
public static void main(String []args)
	{
		// Create a Scanner Object
		Scanner input=new Scanner(System.in);
		
		// getting input for the weight and height from the user
        System.out.println("Enter weight :");
        double weight= input.nextDouble();
		System.out.println("Enter height :");
        double height = input.nextDouble();
		
		// BMI calculation and provoding status
		double BMI=(weight)/(height*height);
        if (BMI<=18.4) {
            System.out.println("Underweight");
        }
        else if (BMI>=18.5 && BMI<=24.9) {
            System.out.println("Normal");
        }
		else if(BMI>=25.0 && BMI<=39.9){
			 System.out.println("Overweight");
		}
		else {
            System.out.println("Obese");
		}
		input.close();
	}
}