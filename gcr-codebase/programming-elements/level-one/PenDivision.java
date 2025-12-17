//Calculating Pen division 
public class PenDivision{
	public static void main(String[]args)
	{   
	    //Taking input 
		int numberOfStudent=3;
		int numberOfPens=14;
		
		//remaining pens calculation
		int remaining=numberOfPens%numberOfStudent;
		int equalDivision=(numberOfPens-remaining)/numberOfStudent;
		
		//Printing pen division and remaining pens
		System.out.println("The Pen Per Student is "+equalDivision+" and the remaining pen not distributed is "+remaining);
	}
}