package Numbers;
import java.util.Scanner;
public class AdditionOFTwoNumber {
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("enter first number");
		int a=scr.nextInt();
		System.out.println("enter 2nd no");
		int b=scr.nextInt();
		int c=a+b;
		System.out.println("result " + c);
	}
}
