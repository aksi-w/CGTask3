package ru.vsu.cs.cg.task3.popova_p_n.Matrix;

public class Matrix3f {

    private float[][] matrix;

    public float[][] getMatrix() {
        return matrix;
    }

    public Matrix3f(float[][] matrix) {
        this.matrix = matrix;
    }

    public static Matrix3f addition(Matrix3f matrix1, Matrix3f matrix2) {
        float[][] res = new float[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                res[i][j] = matrix1.matrix[i][j] + matrix2.matrix[i][j];
            }
        }
        return new Matrix3f(res);
    }

    public static Matrix3f subtraction(Matrix3f matrix1, Matrix3f matrix2) {
        float[][] res = new float[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                res[i][j] = matrix1.matrix[i][j] - matrix2.matrix[i][j];
            }
        }
        return new Matrix3f(res);
    }

    public static Matrix3f multiplication(Matrix3f matrix1, Matrix3f matrix2) {
        float[][] res = new float[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    res[i][j] += matrix1.matrix[i][k] * matrix2.matrix[k][j];
                }
            }
        }
        return new Matrix3f(res);
    }


    public static Matrix3f transposition(Matrix3f matrix) {
        float[][] res = new float[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                res[i][j] = matrix.matrix[j][i];
            }
        }
        return new Matrix3f(res);
    }

    public static Matrix3f zeroMatrix() {
        float[][] zeroMatrix = new float[3][3];
        return new Matrix3f(zeroMatrix);
    }

    public static Matrix3f unitMatrix() {
        float[][] res = new float[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    res[i][j] = 1;
                } else {
                    res[i][j] = 0;
                }
            }
        }
        return new Matrix3f(res);
    }
}

