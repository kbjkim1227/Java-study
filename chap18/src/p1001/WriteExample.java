package p1001;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("c:/temp/test1.txt");
		byte[] data = "abca".getBytes();
		for (int i = 0; i < data.length; i++) {
			os.write(data[i]);
			
		}
		os.flush();
		os.close();
	}

}
