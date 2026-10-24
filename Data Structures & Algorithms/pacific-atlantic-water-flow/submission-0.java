class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int ROWS = heights.length;
        int COLS = heights[0].length;
        boolean[][] pac = new boolean[ROWS][COLS];
        boolean[][] atl = new boolean[ROWS][COLS];


        for(int r=0; r<ROWS;r++){
            dfs(r,0, pac, heights, 0);
            dfs(r, COLS-1, atl, heights, 0);
        }
            for(int c=0; c<COLS;c++){
                dfs(0, c, pac, heights, 0);
                dfs(ROWS - 1, c, atl, heights, 0);
            }

            List<List<Integer>> res = new ArrayList<>();
        for (int r = 0; r < ROWS; r++) {
            for (int c = 0; c < COLS; c++) {
                if (pac[r][c] && atl[r][c]) {
                    res.add(Arrays.asList(r, c));
                }
            }
        }
        return res;
    }

    public void dfs(int r, int c, boolean[][] ocean, int[][] heights, int prevHeight){

        
        if(r<0 || r>=heights.length || c<0 || c>=heights[0].length || ocean[r][c] || heights[r][c] < prevHeight) return;

ocean[r][c] = true;
prevHeight = heights[r][c];
        dfs(r+1, c, ocean, heights, prevHeight);
        dfs(r-1, c, ocean, heights, prevHeight);
        dfs(r, c+1, ocean, heights, prevHeight);
        dfs(r, c-1, ocean, heights, prevHeight);

        
    }
}
