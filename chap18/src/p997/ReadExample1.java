package p997;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		
		InputStream is = new FileInputStream("c:/temp/test1.txt");

		int readByte;

		while(true) {

		readByte = is.read();

		if(readByte == -1) break;

		System.out.print((char)readByte);

		}

	
	}
}