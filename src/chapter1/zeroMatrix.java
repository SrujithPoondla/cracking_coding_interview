package chapter1;

/**
 * Created by srujith reddy on 08-11-2016.
 */
public class zeroMatrix {
    public static void main(String[] args) {
        int M=4,N=4;
        int[][] A={{1, 2, 3, 4}, {0,1,1,1},{2,0,1,2},{3,2,3,0}};
        int[][] zero= zeroA(A,M,N);
        for (int i=0;i<M;i++){
            for (int j=0;j<N;j++){
                System.out.print(zero[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    private static int[][] zeroA(int[][] a,int M, int N) {
        int[][] m= new int[M][N];
        for (int i=0;i<M;i++){
            for (int j=0;j<N;j++){
                if(a[i][j]==0){
                    for (int k=0;k<N;k++){
                        m[i][k]=0;
                    }
                    for(int k=0;k<M;k++){
                        m[k][j]=0;
                    }
                    j=N;
                }else   {
                    m[i][j]=a[i][j];
                }
            }
        }
        return m;
    }
}
