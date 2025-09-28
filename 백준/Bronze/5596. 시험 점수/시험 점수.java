import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] minGuk = new int[4];
        int[] manSae = new int[4];
        int s = 0, t = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            minGuk[i] = Integer.parseInt(st.nextToken());
            s += minGuk[i];
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            manSae[i] = Integer.parseInt(st.nextToken());
            t += manSae[i];
        }
        if (s >= t) {
            bw.write(String.valueOf(s));
        } else {
            bw.write(String.valueOf(t));
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
