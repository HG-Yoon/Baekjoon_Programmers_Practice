import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken()); // 호텔의 층 수
            int w = Integer.parseInt(st.nextToken()); // 각 층의 방 수
            int n = Integer.parseInt(st.nextToken()); // 몇 번째 손님
            int floor = (n % h == 0) ? h : n % h;
            int room = (n - 1) / h + 1;
            if (room < 10) {
                bw.write(String.valueOf(floor) + "0" + String.valueOf(room) + "\n");
            } else {
                bw.write(String.valueOf(floor) + String.valueOf(room) + "\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
