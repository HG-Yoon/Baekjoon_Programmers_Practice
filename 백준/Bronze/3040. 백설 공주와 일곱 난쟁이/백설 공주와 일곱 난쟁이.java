import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    static List<Integer> solution(List<Integer> list) {
        int totalSum = 0;
        boolean found = false;
        for (int n : list) {
            totalSum += n;
        }
        int removeSum = totalSum - 100;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == removeSum) {
                    list.remove(list.get(j));
                    list.remove(list.get(i));
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }
        Collections.sort(list);
        return list;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            int num = Integer.parseInt(br.readLine());
            list.add(num);
        }
        List<Integer> answer = solution(list);
        for (int n : answer) {
            bw.write(String.valueOf(n) + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}