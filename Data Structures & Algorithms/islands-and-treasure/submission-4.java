class Solution {
    int INF = Integer.MAX_VALUE;

    public void islandsAndTreasure(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();

        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (grid[r][c] == 0) {
                    q.add(new int[]{r, c});
                }
            }
        }

        bfs(grid, q);
    }

    public void bfs(int[][] grid, Queue<int[]> q) {
        if (q.isEmpty()) return;

        int size = q.size();

        while (size-- > 0) {
            int[] curr = q.poll();
            int r = curr[0];
            int c = curr[1];

            visit(grid, q, r + 1, c, grid[r][c] + 1);
            visit(grid, q, r - 1, c, grid[r][c] + 1);
            visit(grid, q, r, c + 1, grid[r][c] + 1);
            visit(grid, q, r, c - 1, grid[r][c] + 1);
        }

        bfs(grid, q);
    }

    public void visit(int[][] grid, Queue<int[]> q, int r, int c, int dist) {
        if (r < 0 || c < 0 || r >= grid.length ||
            c >= grid[0].length || grid[r][c] != INF) {
            return;
        }

        grid[r][c] = dist;
        q.add(new int[]{r, c});
    }
}