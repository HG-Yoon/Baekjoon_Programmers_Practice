import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String S = br.readLine();
        int[] count = new int[26];
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            count[c - 'a']++;
        }
        for (int i = 0; i < count.length; i++) {
            bw.write(String.valueOf(count[i]) + " ");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}
