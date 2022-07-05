class Solution {
    public void DFS(int i, int j, char[][] grid){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]=='0') return;
        
        grid[i][j]='0';
        DFS(i+1, j, grid);
        DFS(i, j+1, grid);
        DFS(i-1, j, grid);
        DFS(i, j-1, grid);
    
    }
        
    public int numIslands(char[][] grid) {
       int count=0;
   
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
            if(grid[i][j]=='1'){
            DFS(i, j, grid);
                count++;
            }
          }
        }
        return count;
    }
}
