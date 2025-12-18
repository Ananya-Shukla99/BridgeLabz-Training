//A program to check whether its Spring Season
public class SpringSeason
{
	public static void main(String []args)
	{
		
		// getting values of month and day from the user from cmd
		int month=Integer.parseInt(args[0]);
		int day =Integer.parseInt(args[1]);

		// printing if its a Spring Season or Not 

        if ((month == 3 && day >= 20 && day <= 31) ||
            (month == 4 && day >= 1 && day <= 30) ||
            (month == 5 && day >= 1 && day <= 31) ||
            (month == 6 && day >= 1 && day <= 20)) 
		{
            System.out.println("Its a Spring Season");
        }
		else{
			System.out.println("Not a Spring Season");
		}
		
	}
}