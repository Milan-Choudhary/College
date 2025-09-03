package Java;

public class DFS {
    public static void main(String[] args){
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        int rows = matrix.length;
        int columns = matrix[0].length;


        boolean[][] list = new boolean[rows][columns];

        func(matrix,0,0,rows,columns,list);


}


    public static void func(int[][] matrix,int r,int c,int rows,int columns,boolean[][] list){

        if(r < 0 || r >= rows || c < 0 || c >= columns || list[r][c] == true){
            return;
        }

        list[r][c] = true;
        System.out.print(matrix[r][c] + "-->");


        int[] Rm = {0,1,0,-1};
        int[] Cm = {1,0,-1,0};

        for(int k = 0; k<4; k++){
            int nr = r + Rm[k];
            int nc = c + Cm[k];

            func(matrix,nr,nc,rows,columns,list);
        }
    }

   
    
}
