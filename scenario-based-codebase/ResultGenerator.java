//Raj’s Result Generator ‍️
import java.util.*;

public class ResultGenerator
{
	public static void main(String []args){
		
		Scanner sc=new Scanner (System.in);
        
		int []brr=new int[5];
		int sum-0;
		for(int i=0;i<5;i++)
		{
		    brr[i]=sc.nextInt();
			sum+=brr[i];
		}
		int Average=sum/arr.length;
		
		if (Average>=80) {
            System.out.println("A");
        }
        else if (Average>=70 && Average<=79) {
            System.out.println("B");
        }
		else if(Average>=60 && Average<=69){
			 System.out.println("C");
		}
        else if (Average>=50 && Average<=59) {
            System.out.println("D");
        }
	    else if (Average>=40 && Average<=49) {
            System.out.println("E");
        }
		else {
            System.out.println("F");
		}
		
		sc.close();
	}
}