import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        if (h == 0) {
            if (m >= 45) {
                m -= 45;
            } else {
                h = 23;
                m += 15;
            }
        } else if (h <= 23) {
            if (m >= 45) {
                m -= 45;
            } else {
                m += 15;
                h -= 1;
            }
        }
        bw.write(String.valueOf(h) + " " + String.valueOf(m));

        bw.flush();
        bw.close();
        br.close();
    }
}
