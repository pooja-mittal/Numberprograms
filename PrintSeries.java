package Numbers;
import java.util.Scanner;
public class PrintSeries {

	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("enter total no of lines");
		int n=scr.nextInt();
		int spaces=n-1;
		for(int i=0; i<n; i++) {
			for(int j=0; j<spaces; j++) {
				System.out.print(" ");
			} for(int k=0; k<(2*i+1); k++) {
				System.out.print("*"+ " ");
			}
			spaces--;
			System.out.println();
		}

	}

}
