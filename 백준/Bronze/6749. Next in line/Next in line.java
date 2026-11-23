import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int y = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int d = m - y;
        int a = m + d;
        bw.write(Integer.toString(a));
        
        br.close();
        bw.flush();
        bw.close();
    }
}