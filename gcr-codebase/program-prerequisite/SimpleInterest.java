import java.util.*;
class SimpleInterest{
	public static void main(String []args){
                Scanner sc =new Scanner(System.in);
                int principal =sc.nextInt();
                int rate=sc.nextInt();
                int time=sc.nextInt();
                int ans=(principal * rate* time);
                System.out.println(ans);
       }
}