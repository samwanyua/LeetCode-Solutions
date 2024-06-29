package Medium;

public class Leet_200 {
    public int numIslands(char[][] grid) {
        int cout = 0;
        // Loop through the 2D grid
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] == '1'){
                    cout += 1;
                    callBFS(grid, i, j);
                }
            }
        }
        return cout;
    }

    public void callBFS(char[][] grid, int i, int j){
    //    Boundary checks
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '0') return;
        grid[i][j] = '0';
        callBFS(grid, i + 1, j); // check up
        callBFS(grid, i -1, j); // down
        callBFS(grid, i, j - 1); // left
        callBFS(grid, i, j + 1); // right

    }
}
