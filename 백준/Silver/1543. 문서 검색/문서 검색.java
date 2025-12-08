import java.io.*;

public class Main {
    public static int BruteForceSearch(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();
        int cnt = 0;
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
            }
            if (j == m) {
                cnt++;
                i += m - 1;
            }
        }
        return cnt;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String document = br.readLine();
        String word = br.readLine();
        int answer = BruteForceSearch(document, word);
        bw.write(String.valueOf(answer));

        bw.flush();
        bw.close();
        br.close();
    }
}
