//Finding Average Marks In Pcm
public class AverageMarksInPcm{
	public static void main(String []args)
	{
		//Giving input details
		int math=94;
		int physics=95;
		int chemistry=96;
		
		//Marks calculation
		int totalObtained= math+physics+chemistry;
		int numberOfSubjects=3;
		int average=totalObtained/3;
		
		//Printing Marks
		System.out.println( "Sam's average mark in PCM is : "+average);
		
	}
}