import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] minGukScores = new int[4];
        int[] manSeScores = new int[4];
        int s = 0, t = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            minGukScores[i] = Integer.parseInt(st.nextToken());
            s += minGukScores[i];
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            manSeScores[i] = Integer.parseInt(st.nextToken());
            t += manSeScores[i];
        }
        if (s != t) {
            bw.write(String.valueOf(Math.max(s, t)));
        } else {
            bw.write(String.valueOf(s));
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
