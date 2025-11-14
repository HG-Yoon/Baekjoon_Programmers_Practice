import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        String s;
        for (int i = 0; i < t; i++) {
            s = br.readLine();
            char[] ch = s.toCharArray();
            int cnt = 0, total = 0;
            for (int j = 0; j < ch.length; j++) {
                if (ch[j] == 'O') {
                    cnt++;
                    total += cnt;
                } else {
                    cnt = 0;
                }
            }
            bw.write(String.valueOf(total) + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
