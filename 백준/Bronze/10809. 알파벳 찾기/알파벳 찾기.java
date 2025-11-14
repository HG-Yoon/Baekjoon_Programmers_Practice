import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] alphabet = new int[26];
        Arrays.fill(alphabet, -1);
        String s = br.readLine();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int idx = c - 'a';
            if (alphabet[idx] == -1) {
                alphabet[idx] = i;
            }
        }
        for (int i = 0; i < alphabet.length; i++) {
            bw.write(String.valueOf(alphabet[i]) + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
