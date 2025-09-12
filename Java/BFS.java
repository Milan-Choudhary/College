package Java;
import java.util.*;


public class BFS {
    public static void main(String[] args){

        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        boolean[][] visited = new boolean[matrix.length][matrix[0].length];

        Queue<int[]> q = new LinkedList<>();

        visited[0][0] = true;

        q.add(new int[]{0, 0});

        int[] Rm = {0,1,0,-1};
        int[] Cm = {1,0,-1,0};

        while(!q.isEmpty()){
            int[] cell = q.poll();
            int row = cell[0];
            int col = cell[1];

            System.out.print(matrix[row][col] + "->");
            
            for(int i = 0; i<4; i++){
                int r = row + Rm[i];
                int c = col + Cm[i];

                if(r >= 0 && r < matrix.length && c >= 0 && c < matrix[0].length && visited[r][c] == false){
                    visited[r][c] = true;
                    q.add(new int[]{r,c});
                }
            }
            
        }
 

        

    }
}
