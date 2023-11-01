package ru.vsu.cs.cg.task3.popova_p_n.Matrix;

public class Matrix3x3 {

    private int[][] matrix;
    public int[][] getMatrix() {
        return matrix;
    }
    public Matrix3x3(int[][] matrix) {
        this.matrix = matrix;
    }

    public static Matrix3x3 addition(Matrix3x3[] matrix) {
        int[][] res = new int[3][3];
        for (Matrix3x3 m : matrix) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    res[i][j] += m.matrix[i][j];
                }
            }
        }
        return new Matrix3x3(res);
    }

    public static Matrix3x3 subtraction(Matrix3x3[] matrix) {
        int[][] res = new int[3][3];
        for (Matrix3x3 m : matrix) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    res[i][j] -= m.matrix[i][j];
                }
            }
        }
        return new Matrix3x3(res);
    }
    public static Matrix3x3 multiplication(Matrix3x3[] matrices) {
        int[][] result = new int[3][3];
        for (Matrix3x3 m : matrices) {
            int[][] currentMatrix = m.getMatrix();
            int[][] newResult = new int[3][3];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    for (int k = 0; k < 3; k++) {
                        newResult[i][j] += result[i][k] * currentMatrix[k][j];
                    }
                }
            }
            result = newResult;
        }
        return new Matrix3x3(result);
    }

}

