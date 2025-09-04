import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int solution(int a, int b, int c) {
        int answer = 0;
        int max = 0;
        if (a == b && a == c) {
            answer = 10000 + a * 1000;
        } else if (a == b || a == c && a != b) {
            answer = 1000 + a * 100;
        } else if (b == c && b != a) {
            answer = 1000 + b * 100;
        } else if (a != b && b != c) {
            max = Math.max(a, Math.max(b, c));
            answer = max * 100;
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        bw.write(String.valueOf(solution(a, b, c)));

        bw.flush();
        bw.close();
        br.close();
    }
}
