package test;

public class Test1 {

	public static void main(String[] args) {
		
		int i = 0;
		
		//for(;;) {
			while(true) {
			
			i++;
			
			if(i%5!= 0) continue;
			
			if(i >50) break;
			
			System.out.println("i :"+i);
			
			
						
		}

	}

}
