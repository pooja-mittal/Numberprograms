package Numbers;
import java.util.Scanner;
public class UseWhile {

	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("enter one number");
		int num=scr.nextInt();
		int rev=num;
		int rem=1;
		int m=0;
		while(num>0) {
			rem=num%10;
			m=(m*10)+rem;
			num=num/10;
		}
		System.out.println("reverse "+ m);
		if(m==rev)
			System.out.println("plaindrome");
		else
			System.out.println("not");
	}

}
