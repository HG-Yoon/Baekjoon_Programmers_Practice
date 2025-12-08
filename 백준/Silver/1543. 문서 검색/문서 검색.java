import java.io.*;

public class Main {

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));) {

            String document = br.readLine();
            String word = br.readLine();
            int i = 0; // 문서 탐색 시작 위치
            int count = 0;
            while (i <= document.length() - word.length()) {
                if (document.substring(i, i + word.length()).equals(word)) {
                    count += 1; // 단어를 찾았으니 카운트 증가
                    i += word.length(); // 겹치지 않게 다음 탐색은 단어 끝 이후부터
                } else {
                    i += 1; // 매칭되지 않으면 한 칸 앞으로 이동
                }
            }
            bw.write(String.valueOf(count));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}