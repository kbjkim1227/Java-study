package P1020;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamExample {

	public static void main(String[] args) throws Exception {
		String originalFileName =
				"C:\\Temp\\h.jpg";
				String targetFileName = "C:\\target\\h.jpg";
				
				FileInputStream fis = new FileInputStream(originalFileName);
				FileOutputStream fos = new FileOutputStream(targetFileName);
				
				int readByteNo;
				byte[] readBytes= new byte[100];
				while ((readByteNo = fis.read(readBytes)) != -1) {
					fos.write(readBytes, 0, readByteNo);
				}	
					fos.flush();
					fos.close();
					fis.close();
					
					System.out.println("복사잘됨");
					
				

	}

}
