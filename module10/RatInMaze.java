package module10;

public class RatInMaze {
    static int N = 5;
    static boolean isSafe(int maze[][], int x, int y) {
        return (x >= 0 && x < N && y >= 0 && y < N && maze[x][y] == 1);
    }
    static boolean solveMaze(int[][] maze, int x, int y, int[][] result) {
        // Base Case
        if (x == N - 1 && y == N - 1 && maze[x][y] == 1) {
            result[x][y] = 1;
            return true;
        }
        if (isSafe(maze, x, y)) {
            result[x][y] = 1;
            // Move Down
            if (solveMaze(maze, x + 1, y, result))
                return true;
            // Move Right
            if (solveMaze(maze, x, y + 1, result))
                return true;
             // Backtrack
            result[x][y] = 0;
            return false;
        }
        return false;
    }
    public static void main(String[] args) {
        int maze[][] = {
                {1,1,0,1,0},
                {0,1,0,1,0},
                {0,1,0,0,0},
                {0,1,1,1,1},
                {0,0,0,0,1}
        };
        int result[][] = new int[N][N];
        if (solveMaze(maze, 0, 0, result)) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }

        } else {
            System.out.println("No Solution Found");
        }
    }
}