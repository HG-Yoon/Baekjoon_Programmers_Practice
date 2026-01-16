import java.io.*;

public class Main {
    static int solution(int n) {
        if ((n % 4 == 0 && n % 100 != 0) || (n % 400 == 0)) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int y = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(solution(y)));

        bw.flush();
        bw.close();
        br.close();
    }
}
