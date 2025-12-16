import java.util.*;
class VolumeOfACylinder{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
                int radius=sc.nextInt();
                int height=sc.nextInt();
                double pi=3.14;
                double volume= pi * (radius *radius)*height;
                System.out.println(volume);
       }
}
	