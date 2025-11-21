package day05.q02;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {
	int  inputId()throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int id = Integer.parseInt(str);
		
		return id;
	}

}
