package chap4;

public class SwitchExample {

	public static void main(String[] args) {
		int num = 95;
		char myGrade;
		
		switch(num/10) {
		case 10 :
		case 9 :
			myGrade = 'A';
			break;
		
		case 8 :
			myGrade = 'B';
			break;
			
		case 7 :
			myGrade = 'C';
			break;
			
		case 6 :
			myGrade = 'D';
			break;
			
		case 5 :
			myGrade = 'F';
			break;
	
			
		}

	}

}
