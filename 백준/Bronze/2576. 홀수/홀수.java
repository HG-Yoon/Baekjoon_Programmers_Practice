import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[7];
        List<Integer> odds = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (arr[i] % 2 != 0) {
                odds.add(arr[i]);
            }
        }
        if (odds.isEmpty()) {
            bw.write("-1");
        } else {
            int sum = 0;
            int min = odds.get(0);
            for (int i = 0; i < odds.size(); i++) {
                sum += odds.get(i);
                min = Math.min(min, odds.get(i));
            }
            bw.write(String.valueOf(sum) + "\n" + String.valueOf(min));
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}
