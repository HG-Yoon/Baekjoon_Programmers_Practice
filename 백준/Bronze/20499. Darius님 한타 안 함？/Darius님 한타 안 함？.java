import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        String[] kda = input.split("/");
        int k = Integer.parseInt(kda[0]);
        int d = Integer.parseInt(kda[1]);
        int a = Integer.parseInt(kda[2]);
        if (k + a < d || d == 0) {
            bw.write("hasu");
        } else {
            bw.write("gosu");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
