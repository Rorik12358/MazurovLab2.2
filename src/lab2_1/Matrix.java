package lab2_1;

/**
 * Created by m18 on 15.02.2016.
 */
public class Matrix {
    private int[][] arr;

    public int[][] getArr() {
        return arr;
    }

    public void setArr(int[][] arr) {
        this.arr = arr;
    }

    public int[][] add(Matrix matrix){
        int[][] arr1 = this.getArr();
        int[][] arr2 = matrix.getArr();
        int[][] res = new int[2][2];
        for(int row = 0; row < res.length; row++){
            for(int col = 0; col < res[row].length; col++){
                res[row][col] = arr1[row][col]+arr2[row][col];
            }
        }
        return res;
    }
    public int[][] mult(Matrix matrix){
        int[][] arr1 = this.getArr();
        int[][] arr2 = matrix.getArr();
        int[][] res = new int[arr1.length][arr2[0].length];
        for(int row = 0; row < res.length; row++){
            for(int col = 0; col < res[row].length; col++){
                int resultRowCol = 0;
                for(int i = 0; i < arr2.length; i++){
                    resultRowCol += arr1[row][i]*arr2[i][col];
                }
                res[row][col] = resultRowCol;
            }
        }
        return res;
    }

    public Matrix(int[][] arr) {
        this.arr = arr;
    }
}
