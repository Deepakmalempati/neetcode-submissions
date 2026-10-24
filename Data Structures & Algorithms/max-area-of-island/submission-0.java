class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        
        int maxArea =0;

        for(int i=0; i<grid.length;i++){
            for(int j=0; j<grid[i].length;j++){
                if(grid[i][j]==1){
                    int area= callBfs(grid, i, j);
                    maxArea = Math.max(maxArea, area);
                }
            }
        }
        return maxArea;
    }

    public int callBfs(int[][] grid, int i, int j){

        if( i<0 || j<0 || i>=grid.length || j>=grid[i].length || grid[i][j]==0) return 0;

        grid[i][j]=0;
        int area = 1;
        area += callBfs(grid, i+1, j);
        area += callBfs(grid, i-1, j);
        area += callBfs(grid, i, j+1);
        area += callBfs(grid, i, j-1);

        return area;
    }
}
