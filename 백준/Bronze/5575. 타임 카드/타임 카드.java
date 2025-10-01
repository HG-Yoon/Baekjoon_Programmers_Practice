import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int h1 = Integer.parseInt(st.nextToken());
            int m1 = Integer.parseInt(st.nextToken());
            int s1 = Integer.parseInt(st.nextToken());
            int h2 = Integer.parseInt(st.nextToken());
            int m2 = Integer.parseInt(st.nextToken());
            int s2 = Integer.parseInt(st.nextToken());
            int answerH, answerM = 0, answerS = 0;
            if (s2 < s1) {
                s2 += 60;
                answerS = s2 - s1;
                m2 -= 1;
            } else if (s2 >= s1) {
                answerS = s2 - s1;
            }

            if (m2 < m1) {
                m2 += 60;
                answerM = m2 - m1;
                h2 -= 1;
            } else if (m2 >= m1) {
                answerM = m2 - m1;
            }

            answerH = h2 - h1;

            bw.write(String.valueOf(answerH) + " " + String.valueOf(answerM) + " " + String.valueOf(answerS) + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
