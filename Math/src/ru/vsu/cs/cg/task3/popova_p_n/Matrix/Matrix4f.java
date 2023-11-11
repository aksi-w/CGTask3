package ru.vsu.cs.cg.task3.popova_p_n.Matrix;

public class Matrix4f {
    private int[][] matrix;

    public int[][] getMatrix() {
        return matrix;
    }

    public Matrix4f(int[][] matrix) {
        this.matrix = matrix;
    }

    public static Matrix4f addition(Matrix4f[] matrix) {
        int[][] res = new int[4][4];
        for (Matrix4f m : matrix) {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    res[i][j] += m.matrix[i][j];
                }
            }
        }
        return new Matrix4f(res);
    }

    public static Matrix4f subtraction(Matrix4f[] matrices) {
        int[][] result = new int[4][4];
        for (Matrix4f m : matrices) {
            int[][] currentMatrix = m.getMatrix();
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    result[i][j] -= currentMatrix[i][j];
                }
            }
        }
        return new Matrix4f(result);
    }

    public static Matrix4f multiplication(Matrix4f[] matrices) {
        int[][] result = matrices[0].getMatrix();
        for (int m = 1; m < matrices.length; m++) {
            int[][] currentMatrix = matrices[m].getMatrix();
            int[][] newResult = new int[4][4];
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    for (int k = 0; k < 4; k++) {
                        newResult[i][j] += result[i][k] * currentMatrix[k][j];
                    }
                }
            }
            result = newResult;
        }
        return new Matrix4f(result);
    }

    public static Matrix4f transposition(Matrix4f matrix) {
        int[][] res = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                res[i][j] = matrix.matrix[j][i];
            }
        }
        return new Matrix4f(res);
    }

    public static Matrix4f zeroMatrix() {
        int[][] zeroMatrix = new int[4][4];
        return new Matrix4f(zeroMatrix);
    }

    public static Matrix4f unitMatrix() {
        int[][] res = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    res[i][j] = 1;
                } else {
                    res[i][j] = 0;
                }
            }
        }
        return new Matrix4f(res);
    }
}
