package Numbers;

public class IfPractice {

	public static void main(String[] args) {
		m1(1);
	}
	
	public static void m1(int i) {
		System.out.println(i);
		if(i==3) return ;
		m1(i+1);
		System.out.println(i);
	}

}
