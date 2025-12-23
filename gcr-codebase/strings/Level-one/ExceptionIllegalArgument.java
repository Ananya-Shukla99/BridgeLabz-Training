//program to demonstrate IllegalArgumentException
import java.util.*;

public class ExceptionIllegalArgument
{
	// Method to generate Runtime Exception
    static void generateSubStringException(String s , int start, int end) {
   
        System.out.println("Generating Runtime Exception ");
		
        String result = str.substring(start, end);
		
        System.out.println(result); 
    }

    static void handleException(String s, int start, int end) {
        try {
			
            if (start > end) {
                throw new IllegalArgumentException("Start index cannot be greater than end index");
            }

            String result = str.substring(start, end);
            System.out.println(result);

        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e.getMessage());

        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e);
			
        } finally {
            System.out.println("Exception handling completed.");
        }
    }

	public static void main(String []args){
		
		//create Scanner class
		Scanner sc=new Scanner(System.in);
		
		//Input the string
		String s=sc.next();
		int start=sc.nextInt();
		int end=sc.nextInt();
		
		try{
			generateSubStringException(s, start ,end);
		}
		catch(RuntimeException e){
			System.out.println("RuntimeException catch in main :"+ e);
		}
		
        handleException(s, start ,end);

        sc.close();		
	}
}