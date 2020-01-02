import java.util.*;
import java.io.*;

class PassOne {
	
	public static void main(String[] args) throws Exception {
		String st;
		String[] words;
		File file = new File("OpTab.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		st = br.readLine();
		words = st.split(" ");
		
		for (String a: words)
			System.out.println(a);
	}
}
