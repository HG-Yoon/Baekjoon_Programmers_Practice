import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int y = 0, m = 0;
        for (int i = 0; i < n; i++) {
            // 영식 요금제: 30초마다 10원 청구
            // (t / 30)은 30초 블록 개수, 항상 +1 해서 남는 시간도 포함
            // 예: 29초 → (0+1)*10=10원, 30초 → (1+1)*10=20원, 31초 → (1+1)*10=20원
            // 민식 요금제: 60초마다 15원 청구
            // (t / 60)은 60초 블록 개수, 항상 +1 해서 남는 시간도 포함
            // 예: 59초 → (0+1)*15=15원, 60초 → (1+1)*15=30원, 61초 → (1+1)*15=30원

            int t = Integer.parseInt(st.nextToken());
            y += (t / 30 + 1) * 10;
            m += (t / 60 + 1) * 15;
        }
        if (y == m) {
            bw.write("Y M " + String.valueOf(y));
        } else if (y < m) {
            bw.write("Y " + String.valueOf(y));
        } else if (m < y) {
            bw.write("M " + String.valueOf(m));
        }

        bw.flush();
        bw.close();
        br.close();
    }
}