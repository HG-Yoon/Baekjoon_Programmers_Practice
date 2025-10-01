import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        final double PI = 3.141592;

        double d1 = Double.parseDouble(br.readLine());
        double d2 = Double.parseDouble(br.readLine());
        double answer = PI * d2 * 2 + d1 * 2;
        bw.write(String.valueOf(answer));
        
        bw.flush();
        bw.close();
        br.close();
    }
}
