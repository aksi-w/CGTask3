package ru.vsu.cs.cg.task3.popova_p_n.Vector;

public class Vector3f {
    private float[] vector3f;

    public Vector3f(float[] vector3f) {
        this.vector3f = vector3f;
    }

    public float[] getVector3f() {
        return vector3f;
    }

    public static Vector3f addition(Vector3f vector1, Vector3f vector2, Vector3f vector3) {
        float[] res = new float[3];
        for (int i = 0; i < 3; i++) {
            res[i] = vector1.vector3f[i] + vector2.vector3f[i]+vector3.vector3f[i];
        }
        return new Vector3f(res);
    }

    public static Vector3f subtraction(Vector3f vector1, Vector3f vector2, Vector3f vector3) {
        float[] res = new float[3];
        for (int i = 0; i < 3; i++) {
            res[i] = vector1.vector3f[i] - vector2.vector3f[i]-vector3.vector3f[i];
        }
        return new Vector3f(res);
    }

    public static float lengthVector3(Vector3f vector) {
        return (float) Math.sqrt(vector.vector3f[0] * vector.vector3f[0] + vector.vector3f[1] * vector.vector3f[1] + vector.vector3f[2] * vector.vector3f[2]);
    }

    public static Vector3f normalize(Vector3f vector) {
        float n = lengthVector3(vector);
        if (n != 0) {
            float x = vector.vector3f[0] / n;
            float y = vector.vector3f[1] / n;
            float z = vector.vector3f[3]/n;
            return new Vector3f(new float[]{x, y, z});
        } else {
            return new Vector3f(new float[]{0.0f, 0.0f, 0f});
        }
    }

    public static Vector3f multiplication(Vector3f vector, float a) {
        float[] res = new float[3];
        for (int i = 0; i < 3; i++) {
            res[i] = vector.vector3f[i] * a;
        }
        return new Vector3f(res);
    }

    public static Vector3f division(Vector3f vector, float a) {
        float[] res = new float[3];
        for (int i = 0; i < 3; i++) {
            res[i] = vector.vector3f[i] / a;
        }
        return new Vector3f(res);
    }

    public static float scalar(Vector3f vector1, Vector3f vector2, Vector3f vector3, float u) {
        float uRadians = (float) Math.toRadians(u);
        float cosU = (float) Math.cos(uRadians);
        return lengthVector3(vector1) * lengthVector3(vector2)*lengthVector3(vector3) * cosU;
    }

    public static float scalar(Vector3f vector1, Vector3f vector2, Vector3f vector3) {
        return lengthVector3(vector1) * lengthVector3(vector2)*lengthVector3(vector3);
    }
    public static Vector3f crossProduct(Vector3f vector1, Vector3f vector2, Vector3f vector3) {
        float[] v1 = vector1.getVector3f();
        float[] v2 = vector2.getVector3f();
        float[] v3 = vector3.getVector3f();

        float x = v1[1] * (v2[2] * v3[0] - v2[0] * v3[2]) - v1[2] * (v2[1] * v3[0] - v2[0] * v3[1]);
        float y = v1[2] * (v2[1] * v3[0] - v2[0] * v3[1]) - v1[0] * (v2[2] * v3[0] - v2[0] * v3[2]);
        float z = v1[0] * (v2[1] * v3[2] - v2[2] * v3[1]) - v1[1] * (v2[0] * v3[2] - v2[2] * v3[0]);

        return new Vector3f(new float[]{x, y, z});
    }


}

