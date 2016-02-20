package lab2_1;

import java.util.Arrays;

/**
 * Created by m18 on 15.02.2016.
 */
public class Main {
    public static void main(String[] args) {
        int[][] firstMatrix = {{1,2},{3,4}};
        int[][] secondMatrix = {{5,6},{7,8}};
        Matrix matrix1 = new Matrix(firstMatrix);
        Matrix matrix2 = new Matrix(secondMatrix);
        int[][] resultAdding = matrix1.add(matrix2);
        int[][] resultOfMultiplication = matrix1.mult(matrix2);
        System.out.println("Adding:");
        for(int i = 0; i < resultAdding.length; i++){
            for (int j = 0; j<resultAdding[i].length; j++){
                System.out.print(resultAdding[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Multiplication");
        for(int i = 0; i < resultOfMultiplication.length; i++){
            for (int j = 0; j<resultOfMultiplication[i].length; j++){
                System.out.print(resultOfMultiplication[i][j]+" ");
            }
            System.out.println();
        }
    }
}
