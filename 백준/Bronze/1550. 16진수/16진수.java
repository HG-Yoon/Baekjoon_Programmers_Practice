import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int result = Integer.parseInt(input, 16);
        bw.write(String.valueOf(result));

        br.close();
        bw.flush();
        bw.close();
    }
}