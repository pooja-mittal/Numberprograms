package Numbers;
import java.util.Scanner;
public class CheckEven {
		public static void main(String[] args) {
			Scanner scr=new Scanner(System.in);
			System.out.println("enter one number");
			int num=scr.nextInt();
			if((num%2)==0)
				System.out.println(num + " is even ");
			else 
				System.out.println(num + " is odd");
			
		}
 
}
