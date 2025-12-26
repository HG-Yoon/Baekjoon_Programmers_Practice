class Solution {
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    static int lcm(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }

        return (a / gcd(a, b)) * b;
    }

    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int commonDenom = lcm(denom1, denom2);
        int sumNumer = numer1 * (commonDenom / denom1) + numer2 * (commonDenom / denom2);
        int g = gcd(sumNumer, commonDenom);
        return new int[]{sumNumer / g, commonDenom / g};
    }
}