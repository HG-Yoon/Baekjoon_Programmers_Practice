import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());
        int e = Integer.parseInt(br.readLine());
        int f = Integer.parseInt(br.readLine());
        int[] group1Scores = {a, b, c, d};
        int sumGroup1 = 0;
        for (int score : group1Scores) {
            sumGroup1 += score;
        }
        int minGroup1 = group1Scores[0];
        for (int score : group1Scores) {
            if (score < minGroup1) {
                minGroup1 = score;
            }
        }
        int maxScoreGroup1 = sumGroup1 - minGroup1;
        int maxScoreGroup2 = Math.max(e, f);
        int finalMaxScore = maxScoreGroup1 + maxScoreGroup2;
        bw.write(String.valueOf(finalMaxScore));
        
        bw.flush();
        bw.close();
        br.close();
    }
}
