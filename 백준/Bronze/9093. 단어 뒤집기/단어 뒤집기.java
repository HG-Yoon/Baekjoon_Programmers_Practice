import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String s = br.readLine();
            String[] sArr = s.split(" ");
            for (int j = 0; j < sArr.length; j++) {
                StringBuilder sb = new StringBuilder(sArr[j]);
                sArr[j] = sb.reverse().toString();
                bw.write(sArr[j] + " ");
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
