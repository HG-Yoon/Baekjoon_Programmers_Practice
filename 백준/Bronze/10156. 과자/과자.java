import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int solution(int a, int b, int c) {
        int answer = 0;
        if (a * b > c) {
            answer = a * b - c;
        } else {
            answer = 0;
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken()); // 과자 한 개의 가격
        int n = Integer.parseInt(st.nextToken()); // 사려고 하는 과자의 개수
        int m = Integer.parseInt(st.nextToken()); // 현재 동수가 가진 돈

        bw.write(String.valueOf(solution(k, n, m)));

        bw.flush();
        bw.close();
        br.close();
    }
}
