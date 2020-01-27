import java.util.*;
import java.io.*;

class Prog {
    public static void main(String[] args) throws Exception {
        BBStructure str = new BBStructure();
        String st;
        String[] sentence;
        FileReader file = new FileReader("input.asm");
        str.br = new BufferedReader(file);
        while((st = str.br.readLine()) != null) {
            sentence = st.split(" ");
            for (String word: sentence) {
                if (word.contains(",")) {
                    String[] arr = word.split(",");
                    for (String a: arr) {
                        System.out.println(a);
                    }

                } else {
                    System.out.println(word);
                }
            }
        }
    }
}

class BBStructure {
    public HashMap<Integer, Integer> kpdtab = new HashMap<Integer, Integer>();
    public HashMap<Integer, Integer> pntab = new HashMap<Integer, Integer>();
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

