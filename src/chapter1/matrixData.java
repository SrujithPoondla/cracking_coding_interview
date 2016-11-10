package chapter1;

/**
 * Created by srujith reddy on 10-11-2016.
 */
public class matrixData {
    public static void main(String[] args) {
        int[][] matrix = new int[2][2];
        matrix= new int[][]{{1, 2}, {1, 3}};
        System.out.println(matrix[1][1]);
        if (matrix[1][1]==0){
            matrix[1][1]=0;
        }
    }
}
