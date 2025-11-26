import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        if (s.equals("NLCS")) {
            bw.write("North London Collegiate School");
        } else if (s.equals("BHA")) {
            bw.write("Branksome Hall Asia");
        } else if (s.equals("KIS")) {
            bw.write("Korea International School");
        } else if (s.equals("SJA")) {
            bw.write("St. Johnsbury Academy");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
