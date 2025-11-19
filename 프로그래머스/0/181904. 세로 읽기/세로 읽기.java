class Solution {
    public String solution(String my_string, int m, int c) {
        StringBuilder answer = new StringBuilder();
        int row = my_string.length() / m;
        int col = m;
        char[][] matrix = new char[row][col];
        int index = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = my_string.charAt(index++);
            }
        }
        for (int i = 0; i < row; i++) {
            answer.append(matrix[i][c - 1]);
        }

        return answer.toString();
    }
}