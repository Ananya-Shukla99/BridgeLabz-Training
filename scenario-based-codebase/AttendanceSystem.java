//School Bus Attendance System 
import java.util.*;

public class AttendanceSystem {
	public static void main(String[]args){
		
		//Attendance Array of students
		String[] attendance = {
            "Rahul", "Priya", "Aman", "Neha", "Rohan",
            "Anjali", "Kunal", "Pooja", "Arjun", "Sneha"
        };
		
		System.out.println("Taking attendance  ");
		Scanner sc =new Scanner(System.in);
		
		int totalPresent=0;
		for(String student:attendance){
			System.out.println(student+" Tell Present or Absent?");
			String input= sc.next();
			
			if(input.equals("Present")){
				totalPresent++;
			}
			System.out.println(student+" : " + input);
		}		
		System.out.println("Total number of students present :"+totalPresent);
		System.out.println("Total number of absent stdents are :"+(attendance.length -totalPresent));

        sc.close();
	}
}