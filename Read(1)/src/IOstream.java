import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class IOstream {
	public static void main(String args[]) throws IOException {
		String text;
		InputStreamReader isr =new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		text = br.readLine();
		System.out.println(text);
		
	}

}
