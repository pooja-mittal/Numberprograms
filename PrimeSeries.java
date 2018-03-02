package Numbers;
import java.util.Scanner;
public class PrimeSeries {
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("enter last no");
		int n=scr.nextInt();
		int a;
		System.out.print("2 " + "3 ");
		for(int i=1; i<=n; i++) {
			a=0;
			for(int j=2; j<=i/2; j++) {
				if(i%j!=0)
					a=1;
				else
					a=0;
				
			
			}
			if(a==1)
				System.out.print(i + " ");
	}
}
}
