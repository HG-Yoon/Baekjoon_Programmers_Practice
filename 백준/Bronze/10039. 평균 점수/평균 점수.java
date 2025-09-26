import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] scores = new int[5];
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            scores[i] = Integer.parseInt(br.readLine());
            if (scores[i] < 40) {
                scores[i] = 40;
            }
            sum += scores[i];
        }
        int avg = sum / 5;
        bw.write(String.valueOf(avg));
        
        bw.flush();
        bw.close();
        br.close();
    }
}
