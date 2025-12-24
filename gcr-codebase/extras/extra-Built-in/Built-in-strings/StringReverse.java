//a program count vowels and consonants

public class StringReverse{
	
	public static String Reverse(String s){
		String reverse="";
		for(int i=s.length()-1;i>=0; i--){
			rev+=s.charAt(i))
		}
		return reverse;
	}
    public static void main(String[]args){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the string : ");
		String s= sc.next();
		
		
		String reversed=reverse(s);
		
		System.out.printin("Reversed string is :"+reversed);
		sc.close();
	}
}