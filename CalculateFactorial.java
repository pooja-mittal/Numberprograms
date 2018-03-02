package Numbers;
import java.math.BigInteger;
import java.util.Scanner;
public class CalculateFactorial {
		public static void main(String[] args) {
			Scanner scr=new Scanner(System.in);
			System.out.println("enter num");
			BigInteger num1=scr.nextBigInteger();
			BigInteger fact=BigInteger.ONE;
			for(BigInteger i=BigInteger.ONE; i.compareTo(num1)<=0; i=i.add(BigInteger.ONE)) {
				fact=fact.multiply(i);
			}
			System.out.println("factorial "+ fact);
			
			
		}

}
