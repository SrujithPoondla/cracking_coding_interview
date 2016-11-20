package Leetcode;

/**
 * Created by srujith reddy on 17-11-2016.
 */
public class battleships {
    public static void main(String[] args) {
        char[][] bship = {{'x','.', '.', 'x'},{'x','.', '.', 'x'},{'x','.', '.', 'x'}};
        count(bship,4,4);

    }

    private static void count(char[][] bship,int m, int n) {
        int count =0;
        for(int i=0;i<m-1;i++){
            for(int j=0;j<n-1;j++){
                if(bship[i][j]=='x'){
                    if(bship[i+1][j]=='.' & bship[i+1][j+1]=='.'){
                        count = count +1;
                    }
                    if(bship[i][j+1]=='x'||bship[i+1][j+1]=='.'){
                        count= count+1;
                    }
                }
            }
        }
    }
}

