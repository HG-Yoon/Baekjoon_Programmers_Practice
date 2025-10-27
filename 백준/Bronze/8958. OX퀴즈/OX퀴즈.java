import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String s = br.readLine();
            String[] parts = s.split("");
            int ans = 0;
            int cnt = 0;
            for (String part : parts) {
                if (part.equals("O")) {
                    cnt++;
                    ans += cnt;
                } else if (part.equals("X")) {
                    cnt = 0;
                    ans += cnt;
                }
            }
            bw.write(ans + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
