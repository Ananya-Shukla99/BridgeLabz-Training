//Election Booth Manager ️
import java.util.*;

public class BoothManager{
	public static void main(String []args){
		
		Scanner sc=new Scanner (System.in);
        
		int age=sc.nextInt();
		int count=(age>=18)? 1:0;
		while(age !=0){
			
			age=sc.nextInt();
			if(age>=18){
				count++;
			}
		}
		System.out.println("Number of voter"+ count);
		
		sc.close();
	}
}