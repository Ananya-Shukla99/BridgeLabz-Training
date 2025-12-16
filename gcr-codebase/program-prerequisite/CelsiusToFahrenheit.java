import java.util.*;
class CelsiusToFahrenheit{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		int faherenheit=(x *9/5) + 32;
		System.out.println(faherenheit);
	}
}