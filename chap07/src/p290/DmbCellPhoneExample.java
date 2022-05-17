package p290;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		//DmbCellPhone 객체 생성
		DmbCellPhone dmbCellphone = new DmbCellPhone("자바폰", "검정", 10);
		
		//CellPhone으로부터 상속받은 필드
		System.out.println("모델:"+ dmbCellphone.model);
		System.out.println("색상:"+ dmbCellphone.color);
		
		//DmbCellPhone의 필드
		System.out.println("채널:"+ dmbCellphone.channel);
		
		//CellPhone으로부터 상속받은 메소드 호출
		dmbCellphone.powerOn();
		dmbCellphone.bell();
		dmbCellphone.sendVoice("엽뗴요");
		dmbCellphone.receiveVoice("안냐세요.저는 길동");
		dmbCellphone.sendVoice("아 예 반갑삼");
		dmbCellphone.receiveVoice("잘지내시죠???");
		dmbCellphone.sendVoice("아니요 바빠요 끊을게요");
		dmbCellphone.hangUp();
		
		//DmbCellPhone의 메소드 호출
		dmbCellphone.turnOndmb();
		dmbCellphone.changeChannelDmb(12);
		dmbCellphone.turnOffDmb();

	}

}
