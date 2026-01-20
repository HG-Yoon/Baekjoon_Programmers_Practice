import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<Integer> arr = new ArrayList<>(9);
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            int n = Integer.parseInt(br.readLine());
            arr.add(n);
            sum += arr.get(i);
        }
        int twoSum = sum - 100;
        boolean found = false;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (i != j && arr.get(i) + arr.get(j) == twoSum) {
                    found = true;
                    arr.remove(j);
                    arr.remove(i);
                    break;
                }
            }
            if (found) {
                break;
            }
        }
        Collections.sort(arr);
        for (int n : arr) {
            bw.write(String.valueOf(n) + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}