package Java;

public class PODttzettf {
    public static void main(String[] args){
        int[][] grid = new int[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}}; 
        int top = 0;
       int bottom = grid.length - 1;
       int left = 0;
       int right = grid[0].length - 1;
       int t = 0, b = 0, l = 0, r = 0;

       while(top < bottom){
        for(int i = 0; i<grid[0].length; i++){
            if(grid[top][i] == 1){
                t += 1;
            }
            if(grid[bottom][i] == 1){
                b += 1;
            }
        }

         if(t != 0 && b != 0){
                break;
            }
            else if(t != 0 && b == 0){
                bottom -= 1;
            }
            else if(t == 0 && b != 0){
                top += 1;
            }
            else{
                top += 1;
                bottom -= 1;
            }

       }


       while(left < right){
        for(int i = 0; i<grid.length; i++){
            if(grid[i][left] == 1){
                l += 1;
            }
            if(grid[i][right] == 1){
                r += 1;
            } 
        }
        if(l != 0 && r != 0){
                break;
            }
            else if(l != 0 && r == 0){
                right -= 1;
            }
            else if(l == 0 && r != 0){
                left += 1;
            }
            else{
                left += 1;
                right -= 1;
            }
       }

       int height = bottom - top + 1;
       int length = right - left + 1;

        System.out.println(length * height);
    }
}
