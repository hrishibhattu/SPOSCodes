import java.util.*;
import java.io.*;

class PassOne {

		
	public static void main(String[] args) throws Exception {
		String st;
		HashMap<String, String> inpHashMap = new HashMap<String, String>();
		String[] words;
		File file = new File("OpTab.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		while((st = br.readLine()) != null) {
			words = st.split(" ");
			inpHashMap.put(words[0], words[1]);
		}
		
//		for (String a: words)
//			System.out.println(a);
		getInputFile();
		
	}
	
	public static void getInputFile() throws Exception {
		String st;
//		ArrayList<String> inp = new ArrayList<String>();
		String[] inp;
		File fil = new File("input.asm");
		BufferedReader br = new BufferedReader(new FileReader(fil));
		while((st = br.readLine()) != null) {
			inp = st.split(" ");
			for(String b: inp)
				System.out.println(Arrays.toString(inp));
		}
		
	}
	
	public void dispOutput() {
			
		
	}
}
