package Numbers;
import java.math.BigInteger;
import java.util.Scanner;
public class ElseBig {
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		for(BigInteger x=BigInteger.ONE; x.compareTo(new BigInteger("10"))<=0; x=x.add(BigInteger.ONE)) {
			System.out.println(x);
		
		}
			
	}

}
