//Online Quiz Application
 
import java.util.*;

public class QuizApplication{
	
	public static void main(String[]args){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Online Quiz Application");
		
		System.out.println("Let's Go !");
		String [][]question=new String[5][2];
		
		//storing 5 question and answer
		//storing 5 question and answer
		question[0][0]="Is the Earth round?";
		question[0][1]="Yes";
		question[1][0]="Is the Sun a planet?";
		question[1][1]="No";
		question[2][0]="Is the Sun a star?";
		question[2][1]="Yes";
		question[3][0]="Is gold a metal?";
		question[3][1]="Yes";
		question[4][0]="Can humans breathe underwater without equipment?";
		question[4][1]="No";
		
		int score=0;
		for(int i=0;i<5; i++){
			System.out.println("Your question no. "+(i+1)+ " is :");
			System.out.println(question[i][0] +"(Yes/No)");
			
			//taking user responce
			String input =sc.next();
			
			if(input.equals(question[i][1])){
				score+=10;
			}
		}
		System.out.println("Your score is :"+score);
		System.out.println("Thank You For Using Our Services !");
		
		//close Scanner object
		sc.close();
	}
}