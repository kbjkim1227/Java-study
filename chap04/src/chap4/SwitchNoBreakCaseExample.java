package chap4;

public class SwitchNoBreakCaseExample {

	public static void main(String[] args) {
		int time = (int)(Math.random()*5) + 6;
		System.out.println("[현재시간: " + time + " 시]");
		
		switch (time) {
		case 6:
			System.out.println("출근");
		case 7:
			System.out.println("회의");
		case 8:
			System.out.println("업무");
			break;
		case 9:
			System.out.println("농땡이");
		
		default:
			System.out.println("외근");
			break;
		}
	
				
				
		// TODO Auto-generated method stub

	}

}
