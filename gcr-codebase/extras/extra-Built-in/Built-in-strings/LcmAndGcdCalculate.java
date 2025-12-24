//a program to calculate gcd and lcm

import java.util.*;

public class LcmAndGcdCalculate{

    public static int lcm(int first, int second) {
        return (first * second) / gcd(first, second);
    }

	public static int gcd(int first, int second){
	    
		while(second!=0){
		
		    int temp = second;
            second = first % second;
            first = temp;
		}
		return first;
	}
	
	public static void main(String[]args){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number :");
		int first=sc.nextInt();
		System.out.println("Enter the number :");
		int sec=sc.nextInt();
		
        System.out.println("GCD is "+ gcd(first, sec));
		
        System.out.println("LCM is "+ lcm(first, sec));

        sc.close();
		
	}
}
