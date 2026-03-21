package Module9;

public class MazePath {
        public static void findPaths(int i, int j, int n, int m, String path) {
            // reached destination
            if (i == n - 1 && j == m - 1) {
                System.out.println(path);
                return;
            }

            // move down
            if (i < n - 1) {
                findPaths(i + 1, j, n, m, path + "D");
            }

            // move right
            if (j < m - 1) {
                findPaths(i, j + 1, n, m, path + "R");
            }
        }

        public static void main(String[] args) {
            int n = 3, m = 3;
            findPaths(0, 0, n, m, "");
        }
    }

