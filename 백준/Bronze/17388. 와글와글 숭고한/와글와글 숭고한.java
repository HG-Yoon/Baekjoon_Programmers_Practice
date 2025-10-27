import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int sum = s + k + h;
        if (sum >= 100) {
            bw.write("OK");
        } else {
            int min = Math.min(s, Math.min(k, h));
            if (min == s) {
                bw.write("Soongsil");
            } else if (min == k) {
                bw.write("Korea");
            } else if (min == h) {
                bw.write("Hanyang");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
