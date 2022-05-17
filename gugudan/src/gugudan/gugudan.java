
package gugudan;

public class gugudan {

	public static void main(String[] args) {
		for (int m=2; m<=9; m++) {
			System.out.println("**"+ m + "단" +"**");
			for (int n=1; n<=9; n++) {
				System.out.printf("%d x %d =%2d", m, n, (m*n), "\t");
				System.out.println(" ");
			}
		}
		System.out.println();

	}

}
