package p1001;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample2 {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("c:/temp/test1.txt");
		byte[] data = "뭔데이게".getBytes();
		os.write(data);
		os.flush();
		os.close();
	}

}
