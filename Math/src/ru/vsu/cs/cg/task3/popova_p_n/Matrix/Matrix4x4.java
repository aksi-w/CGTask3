package ru.vsu.cs.cg.task3.popova_p_n.Matrix;

public class Matrix4x4 {
    private int[][] matrix;

    public int[][] getMatrix() {
        return matrix;
    }

    public Matrix4x4(int[][] matrix) {
        this.matrix = matrix;
    }

    public static Matrix4x4 addition(Matrix4x4[] matrix) {
        int[][] res = new int[4][4];
        for (Matrix4x4 m : matrix) {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    res[i][j] += m.matrix[i][j];
                }
            }
        }
        return new Matrix4x4(res);
    }

    public static Matrix4x4 subtraction(Matrix4x4[] matrices) {
        int[][] result = new int[4][4];
        for (Matrix4x4 m : matrices) {
            int[][] currentMatrix = m.getMatrix();
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    result[i][j] -= currentMatrix[i][j];
                }
            }
        }
        return new Matrix4x4(result);
    }

    public static Matrix4x4 multiplication(Matrix4x4[] matrices) {
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
        return new Matrix4x4(result);
    }

    public static Matrix4x4 transposition(Matrix4x4 matrix) {
        int[][] res = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                res[i][j] = matrix.matrix[j][i];
            }
        }
        return new Matrix4x4(res);
    }

    public static Matrix4x4 zeroMatrix() {
        int[][] zeroMatrix = new int[4][4];
        return new Matrix4x4(zeroMatrix);
    }

    public static Matrix4x4 unitMatrix() {
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
        return new Matrix4x4(res);
    }
}
