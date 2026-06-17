class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int ansDenom = denom1 * denom2;
        int ansNumer = (numer1 * denom2) + (numer2 * denom1);
        answer[0] = ansNumer / getGCD(ansDenom, ansNumer);
        answer[1] = ansDenom / getGCD(ansDenom, ansNumer);
        return answer;
    }

    // 최대공약수 구하기 (유클리드 호제법)
    public static int getGCD(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}