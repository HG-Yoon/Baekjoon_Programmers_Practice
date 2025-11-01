import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long a = Long.parseLong(br.readLine());
        long b = Long.parseLong(br.readLine());
        long c = Long.parseLong(br.readLine());

        long abc = a * b * c;
        int[] cnt = new int[10];
        String abcS = String.valueOf(abc);
        for (int i = 0; i < abcS.length(); i++) {
            char ch = abcS.charAt(i);
            cnt[ch - '0']++;
        }
        for (int i = 0; i < cnt.length; i++) {
            bw.write(String.valueOf(cnt[i]) + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
