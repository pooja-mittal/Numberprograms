package Numbers;
import java.util.Scanner;
import java.math.*;
public class BinToDec {

	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("enter one no");
		int num=scr.nextInt();
		int i=0,rem=1;
		double sum=0;
		while(num>0) {
			rem=num%10;
			sum=sum+rem*(Math.pow(2, i));
			num=num/10;
			i++;
		}
		System.out.println("no " + sum);
	}

}
