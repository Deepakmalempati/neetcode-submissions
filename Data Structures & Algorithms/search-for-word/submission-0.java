class Solution {
    public boolean exist(char[][] board, String word) {

        for(int r=0; r<board.length;r++){
            for(int c=0;c<board[0].length;c++){
                if(dfs(board, word, r, c, 0)){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean dfs(char[][] board, String word, int r, int c, int k){
        if(k==word.length()){
            return true;
        }

        if(r<0 || c<0|| r>= board.length || c >= board[0].length || board[r][c] != word.charAt(k) || board[r][c] == '#'){
            return false;
        }

        board[r][c] = '#';
        boolean res = dfs(board, word, r+1, c, k+1)||
        dfs(board, word, r, c+1, k+1) ||
        dfs(board, word, r-1, c, k+1) ||
        dfs(board, word, r, c-1, k+1);

        board[r][c] = word.charAt(k);
        return res;
    }
}
