package forMultiplication;

/**
 * Created by m18 on 15.02.2016.
 */
public class Main {
    public static void main(String[] args) {
        Matr matrix1 = new Matr(new int[][]{{1,3,2},{0,4,-1}});
        Matr matrix2 = new Matr(new int[][]{{2,0,-1,1},{3,-2,1,2},{0,1,2,3}});
        int[][] res = matrix1.mult(matrix2);
        for(int i = 0; i < res.length; i++){
            for (int j = 0; j<res[i].length; j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}
