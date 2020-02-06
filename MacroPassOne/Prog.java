import java.util.*;
import java.io.*;

class Prog {
    public static void main(String[] args) throws IOException {
        BBStructure str = new BBStructure();
            }
}

class BBStructure {
    ArrayList<MntEntry> mnt;
    public HashMap<String, String> kpdtab = new HashMap<String, String>();
    public HashMap<String, Integer> pntab = new HashMap<String, Integer>();
    public BufferedReader br;

    void parse() {
        String st;
        Boolean isname = false;
        MNT mnt = new MNT();
        int line = 0, countl = 0;
        String[] sentence;
        FileReader file = new FileReader("input.asm");
        str.br = new BufferedReader(file);
        while((st = str.br.readLine()) != null) {
            line++;
            sentence = st.split(" ");
            System.out.println(sentence[0]);

            // if line contains MACRO then next line will go into MNT
            if (sentence[0] == "MACRO") {
                isname = true;
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


    }
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

