package homework09;

import java.util.Scanner;

public class SingOf1 {
	static int signOf(int n) {
		
		if(n>0)
			return 1;
		else if (n<0)
			return -1;
		
		return 0;
		
		
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수 x:");
		int x = stdIn.nextInt();
		
		int s = signOf(x);
		System.out.println("signOf(x)는 " + s + "입니다.");

	}

}
