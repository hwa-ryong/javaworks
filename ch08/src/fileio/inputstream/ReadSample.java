package fileio.inputstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadSample {

	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("c:/file/test1.db"); // Stream : 파일에 관련한 것을 연결해주는 것
		
		while(true) {
			int data = is.read();
			if(data == -1)
				break;
			System.out.println(data);
		}
		
		int data;
		while((data = is.read()) != -1) {
			System.out.println(data);
		}

	}

}
