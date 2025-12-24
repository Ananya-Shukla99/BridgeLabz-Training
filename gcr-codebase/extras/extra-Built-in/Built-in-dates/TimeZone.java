// Write a program that displays the current
time in different time zones
import java.time.ZonedDateTime;
import java.time.

public class TimeZone{
	
	public static void main(String[]args){
		
		Date curr=new Date();
		
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");
		
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
        System.out.println("Current Time in GMT: " + sdf.format(currentDate));

        sdf.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
        System.out.println("Current Time in IST: " + sdf.format(currentDate));

        sdf.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
        System.out.println("Current Time in PST: " + sdf.format(currentDate))
	}
	
}