package ru.vsu.cs.cg.task3.popova_p_n.Vector;

public class Vector2f {

    private float[] vector2f;

    public Vector2f(float[] vector2) {
        this.vector2f = vector2;
    }

    public float[] getVector2() {
        return vector2f;
    }

    public static Vector2f addition(Vector2f vector1, Vector2f vector2) {
        float[] res = new float[2];
        for (int i = 0; i < 2; i++) {
            res[i] = vector1.vector2f[i] + vector2.vector2f[i];
        }
        return new Vector2f(res);
    }

    public static Vector2f subtraction(Vector2f vector1, Vector2f vector2) {
        float[] res = new float[2];
        for (int i = 0; i < 2; i++) {
            res[i] = vector1.vector2f[i] - vector2.vector2f[i];
        }
        return new Vector2f(res);
    }

    public static float lengthVector(Vector2f vector) {
        return (float) Math.sqrt(vector.vector2f[0] * vector.vector2f[0] + vector.vector2f[1] * vector.vector2f[1]);
    }

    public static Vector2f normalize(Vector2f vector) {
        float n = lengthVector(vector);
        if (n != 0) {
            float x = vector.vector2f[0] / n;
            float y = vector.vector2f[1] / n;
            return new Vector2f(new float[]{x, y});
        } else {
            return new Vector2f(new float[]{0.0f, 0.0f});
        }
    }

    public static Vector2f multiplication(Vector2f vector, float a) {
        float[] res = new float[2];
        for (int i = 0; i < 2; i++) {
            res[i] = vector.vector2f[i] * a;
        }
        return new Vector2f(res);
    }

    public static Vector2f division(Vector2f vector, float a) {
        float[] res = new float[2];
        for (int i = 0; i < 2; i++) {
            res[i] = vector.vector2f[i] / a;
        }
        return new Vector2f(res);
    }

    public static float scalar(Vector2f vector1, Vector2f vector2, float u) {
        float uRadians = (float) Math.toRadians(u);
        float cosU = (float) Math.cos(uRadians);
        return lengthVector(vector1)*lengthVector(vector2)*cosU;
    }
    public static float scalar(Vector2f vector1, Vector2f vector2) {
        return lengthVector(vector1)*lengthVector(vector2);
    }

}
