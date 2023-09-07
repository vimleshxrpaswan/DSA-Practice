package arrayandarraylist;

public class MinDistance {
    public static int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int[][] memo = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0) {
                    memo[i][j] = j;
                } else if (j == 0) {
                    memo[i][j] = i;
                } else if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    memo[i][j] = memo[i - 1][j - 1];
                } else {
                    memo[i][j] = 1 + Math.min(memo[i - 1][j - 1], Math.min(memo[i - 1][j], memo[i][j - 1]));
                }
            }
        }
        return memo[m][n];
    }

    public static void main(String[] args) {
        String word1 = "horse";
        String word2 = "ros";
        int result = minDistance(word1, word2);
        System.out.println("Minimum number of operations: " + result);
    }
}

