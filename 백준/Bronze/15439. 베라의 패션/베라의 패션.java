import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int answer = n * (n - 1);
        bw.write(String.valueOf(answer));
        
        bw.flush();
        bw.close();
        br.close();
    }
}
