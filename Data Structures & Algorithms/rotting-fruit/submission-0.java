class Solution {
    int fresh = 0;
    int time = 0;

    public int orangesRotting(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();

        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (grid[r][c] == 2) {
                    q.add(new int[]{r, c});
                } else if (grid[r][c] == 1) {
                    fresh++;
                }
            }
        }

        bfs(grid, q);
        return fresh == 0 ? time : -1;
    }

    public void bfs(int[][] grid, Queue<int[]> q) {
        while (fresh > 0 && !q.isEmpty()) {
            int length = q.size();

            for (int i = 0; i < length; i++) {
                int[] curr = q.poll();
                int r = curr[0];
                int c = curr[1];

                visit(grid, r + 1, c, q);
                visit(grid, r - 1, c, q);
                visit(grid, r, c + 1, q);
                visit(grid, r, c - 1, q);
            }

            time++;
        }
    }

    public void visit(int[][] grid, int r, int c, Queue<int[]> q) {
        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || grid[r][c] != 1) {
            return;
        }

        grid[r][c] = 2;
        fresh--;
        q.add(new int[]{r, c});
    }
}