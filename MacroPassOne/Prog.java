import java.util.*;
import java.io.*;

class Prog {
    public static void main(String[] args) throws IOException {
        BBStructure str = new BBStructure();
        String st;
        MNT mnt = new MNT();
        int line = 0, countl = 0;
        String[] sentence;
        FileReader file = new FileReader("input.asm");
        str.br = new BufferedReader(file);
        while((st = str.br.readLine()) != null) {
            line++;
            sentence = st.split(" ");
            System.out.println(sentence[0]);
            if (sentence[0] == "MACRO") {
                String paramSent = str.br.readLine();
                String[] paramSent1 = paramSent.split(" ");
                for (String word: paramSent1) {
                    if (word.contains(",")) {
                        String[] arr = word.split(",");
                        for (String individual: arr) {
                            if (individual.contains("=")) {
                                String[] ind = individual.split("=");
                                mnt.kpdtp += 1;
                                str.kpdtab.put(ind[0], ind[1]);
                            } else {
                                if (str.pntab.containsKey(individual)) {
                                } else {
                                    mnt.pp += 1;
                                    str.pntab.put(individual, mnt.pp);
                                }
                            }
                        }
                    } else {
                    //Nothing
                    }
                }
            }
        }
        System.out.println(str.kpdtab);
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
        this.pp = 0;
        this.kpdtp = kpdtp;
        this.mdtp = mdtp;
    } 

}

