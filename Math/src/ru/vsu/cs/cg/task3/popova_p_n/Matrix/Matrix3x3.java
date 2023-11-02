package ru.vsu.cs.cg.task3.popova_p_n.Matrix;

import org.junit.platform.commons.util.ToStringBuilder;

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
    public static Matrix3x3 multiplication(Matrix3x3[] matrix) {
        int[][] res = matrix[0].getMatrix();
        for (int m = 1; m < matrix.length; m++) {
            int[][] matriX = matrix[m].getMatrix();
            int[][] newRes = new int[3][3];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    for (int k = 0; k < 3; k++) {
                        newRes[i][j] += res[i][k] * matriX[k][j];
                    }
                }
            }
            res = newRes;
        }
        return new Matrix3x3(res);
    }
    public static Matrix3x3 transposition(Matrix3x3 matrix){
        int[][] res = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                res[i][j] = matrix.matrix[j][i];
            }
        }
        return new Matrix3x3(res);
    }

    public static Matrix3x3 zeroMatrix() {
        int[][] zeroMatrix = new int[3][3];
        return new Matrix3x3(zeroMatrix);
    }

    public static Matrix3x3 unitMatrix() {
        int[][] res = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j){
                    res[i][j] = 1;
                } else {
                    res[i][j] = 0;
                }
            }
        }
        return new Matrix3x3(res);
    }
}

