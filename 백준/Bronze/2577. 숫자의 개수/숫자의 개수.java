import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int abc = a * b * c;
        String abcStr = String.valueOf(abc);
        int[] cnt = new int[10];
        for (int i = 0; i < abcStr.length(); i++) {
            cnt[abcStr.charAt(i) - '0']++;
        }
        for (int i = 0; i < cnt.length; i++) {
            bw.write(String.valueOf(cnt[i]) + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
