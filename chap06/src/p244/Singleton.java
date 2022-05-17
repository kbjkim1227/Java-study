package p244;

public class Singleton {
	private static Singleton singleton = new Singleton();
	
	private Singleton() {}
	
	static Singleton getInstance(){
// static이 new를 못쓰게 막음		

		return singleton;
	
			
	}

}
