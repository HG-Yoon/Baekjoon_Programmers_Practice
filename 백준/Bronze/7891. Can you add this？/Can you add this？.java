import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            BigInteger x = new BigInteger(st.nextToken());
            BigInteger y = new BigInteger(st.nextToken());
            BigInteger sum = x.add(y);
            bw.write(String.valueOf(sum) + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}