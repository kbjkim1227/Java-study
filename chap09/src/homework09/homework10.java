package homework09;

import java.util.Scanner;

public class homework10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요");
		int num = scan.nextInt();
		
		int sum = 0;
		for(int i = 0; i <= num; i++) {
			sum += i;

		}
		System.out.println("1부터" + num + "까지의 합은" + sum + "입니다");	

	}

}
