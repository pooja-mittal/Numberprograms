package Numbers;
import java.util.Scanner;
public class PrintSum {
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("enter  no");
		int n=scr.nextInt();
		int sum=1;
		for(int i=1; i<=n; i++) {
			sum=sum*i;
		}
		System.out.println("factorial " + sum);
	}
}
