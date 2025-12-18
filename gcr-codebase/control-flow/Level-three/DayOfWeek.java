//finding the day of week of given date
public class DayOfWeek 
{

    public static void main(String[] args)
	{
	    //taking three command-line arguments:
        int month = Integer.parseInt(args[0]);  
        int day = Integer.parseInt(args[1]);    
        int year = Integer.parseInt(args[2]);   

        // adjusted year
        int adjustedYear = year - (14 - month) / 12;
        int leapYearCorrections = adjustedYear + adjustedYear / 4 - adjustedYear / 100 + adjustedYear / 400;
        int adjustedMonth = month + 12 * ((14 - month) / 12) - 2;
        int dayOfWeek = (day + leapYearCorrections + (31 * adjustedMonth) / 12) % 7;

        System.out.println(dayOfWeek);
    }
}
