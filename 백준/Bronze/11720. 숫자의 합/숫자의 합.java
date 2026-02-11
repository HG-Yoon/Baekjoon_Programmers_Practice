import java.io.*;

public class Main {
    static int solution(String str) {
        int answer = 0;
        for (char c : str.toCharArray()) {
            answer += c - '0';
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        bw.write(String.valueOf(solution(s)));

        bw.flush();
        bw.close();
        br.close();
    }
}