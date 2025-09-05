import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int solution(int n, int[] a) {
        int answer = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == n) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int day = Integer.parseInt(br.readLine());
        int[] cars = new int[5];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 5; i++) {
            cars[i] = Integer.parseInt(st.nextToken());
        }
        bw.write(String.valueOf(solution(day, cars)));

        bw.flush();
        bw.close();
        br.close();
    }
}
