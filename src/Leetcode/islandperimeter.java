package Leetcode;

/**
 * Created by srujithpoondla on 11/23/16.
 */
public class islandperimeter {
    public static int islandPerimeter(int[][] grid) {
        int per=0;
        int count =0;
        for (int i=0;i<grid[0].length;i++){
            while (count<grid.length){
                if(grid[i][count]==1&&grid[i][count-1]==1){
                    per=per+4;
                }
                count=count+1;
            }
            count=0;
        }

        return  per;


    }
    public static void main(String[] args) {
        int[][] arr = {{0,1,1,1},
                {1,1,1,0},
                {0,1,0,0},
                {1,1,0,0}};
        int peri = islandPerimeter(arr);
        System.out.println(peri);

    }
}
