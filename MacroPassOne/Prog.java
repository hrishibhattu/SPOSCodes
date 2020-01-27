import java.util.*;
import java.io.*;

class Prog {
    public static void main(String[] args) throws IOException {
        BBStructure str = new BBStructure();
        String st;
        MNT mnt = new MNT();
        int line = 0;
        String[] sentence;
        FileReader file = new FileReader("input.asm");
        str.br = new BufferedReader(file);
        while((st = str.br.readLine()) != null) {
            line++;
            sentence = st.split(" ");
            System.out.println(sentence[0]);
            for (String word: sentence) {
                if (word.contains(",")) {
                    String[] arr = word.split(",");
                    for (String individual: arr) {
                        if (individual.contains("=")) {
                            String[] ind = individual.split("=");
                            mnt.kpdtp += 1;
                            str.kpdtab.put(ind[0], ind[1]);
                        } else {
                            mnt.pp += 1;
                            str.pntab.put(individual, mnt.pp);
                        }
                    }

                } else {
                    //Nothing
                }
            }
        }
    }
}

class BBStructure {
    public HashMap<String, String> kpdtab = new HashMap<String, String>();
    public HashMap<String, Integer> pntab = new HashMap<String, Integer>();
    public BufferedReader br;
}

class MNT {
    int kp, pp, kpdtp, mdtp;
    String name;

    MNT() {
        this.name = name;
        this.kp = kp;
        this.pp = pp;
        this.kpdtp = kpdtp;
        this.mdtp = mdtp;
    } 

}

