import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> odds = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num % 2 != 0) {
                odds.add(num);
            }
        }
        if (odds.isEmpty()) {
            bw.write("-1");
        } else {
            int oddSum = 0;
            int oddMin = odds.get(0);
            for (int i = 0; i < odds.size(); i++) {
                oddSum += odds.get(i);
                oddMin = Math.min(oddMin, odds.get(i));
            }
            bw.write(String.valueOf(oddSum) + "\n");
            bw.write(String.valueOf(oddMin));
        }
        
        bw.flush();
        bw.close();
        br.close();
    }


}
