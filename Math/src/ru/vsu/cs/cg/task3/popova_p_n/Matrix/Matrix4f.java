package ru.vsu.cs.cg.task3.popova_p_n.Matrix;

import ru.vsu.cs.cg.task3.popova_p_n.Vector.Vector4f;

public class Matrix4f {
    private float[][] matrix;

    public float[][] getMatrix() {
        return matrix;
    }

    public Matrix4f(float[][] matrix) {
        this.matrix = matrix;
    }

    public static Matrix4f addition(Matrix4f matrix1, Matrix4f matrix2) {
        float[][] res = new float[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                res[i][j] = matrix1.matrix[i][j] + matrix2.matrix[i][j];
            }
        }
        return new Matrix4f(res);
    }

    public static Matrix4f subtraction(Matrix4f matrix1, Matrix4f matrix2) {
        float[][] res = new float[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                res[i][j] = matrix1.matrix[i][j] - matrix2.matrix[i][j];
            }
        }
        return new Matrix4f(res);
    }
    public static Matrix4f multiplication(Matrix4f matrix1, Matrix4f matrix2) {
        float[][] res = new float[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    res[i][j] += matrix1.matrix[i][k] * matrix2.matrix[k][j];
                }
            }
        }
        return new Matrix4f(res);
    }



    public static Matrix4f transposition(Matrix4f matrix) {
        float[][] res = new float[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                res[i][j] = matrix.matrix[j][i];
            }
        }
        return new Matrix4f(res);
    }

    public static Matrix4f zeroMatrix() {
        float[][] zeroMatrix = new float[4][4];
        return new Matrix4f(zeroMatrix);
    }

    public static Matrix4f unitMatrix() {
        float[][] res = new float[4][4];
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
    public static Vector4f multiplyOnVector(Matrix4f matrix, Vector4f vector) {
        float[] res = new float[4];
        for (int i = 0; i < 4; i++) {
            res[i] = matrix.matrix[i][0] * vector.getX() +
                    matrix.matrix[i][1] * vector.getY() +
                    matrix.matrix[i][2] * vector.getZ()+
                    matrix.matrix[i][3] * vector.getW();
        }
        return new Vector4f(res[0], res[1], res[2], res[3]);
    }

}