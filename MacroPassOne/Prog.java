import java.util.*;
import java.io.*;

class Prog {
    public static void main(String[] args) throws IOException {
        BBStructure str = new BBStructure();
        String st;
        int line = 0;
        String[] sentence;
        FileReader file = new FileReader("input.asm");
        str.br = new BufferedReader(file);
        while((st = str.br.readLine()) != null) {
            line++;
            sentence = st.split(" ");
            for (String word: sentence) {
                System.out.println(sentence[0]);
                if (word.contains(",")) {
                    String[] arr = word.split(",");
                }

                } else {
                    System.out.println(word);
                }
            }
        }
    }
}

class BBStructure {
    public HashMap<String, Integer> kpdtab = new HashMap<Integer, Integer>();
    public HashMap<String, Integer> pntab = new HashMap<Integer, Integer>();
    public BufferedReader br;
}

class MNT {
    int kp, pp, kpdtp, mdtp;
    String name;

    MNT(String name, int kp, int pp, int kpdtp, int mdtp) {
        this.name = name;
        this.kp = kp;
        this.pp = pp;
        this.kpdtp = kpdtp;
        this.mdtp = mdtp;
    } 

}

