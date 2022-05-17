package p348;

public class RemotecontrolExample {

	public static void main(String[] args) {
//		RemoteControl rc = new RemoteControl() {
			
//			@Override
//			public void turnOn() {/*실행문*/}
			
//			@Override
//			public void turnOff() {/*실행문*/} 
			
//			@Override
//			public void setVolume(int volume) {/*실행문*/}
			
//		};
		
		RemoteControl rc = null; //인터페이스 변수 선언
		rc = new Television(); //객체를 인터페이스 타입에 대입
	    rc.turnOn();
	    rc.turnOff();
	    
	    rc = new Audio(); //객체를 인터페이스 타입에 대입
	    rc.turnOn();
	    rc.turnOff();
	}
}
