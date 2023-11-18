package ru.vsu.cs.cg.task3.popova_p_n.Vector;

public class Vector4f {
    private float x, y, z, w;

    public Vector4f(float x, float y, float z, float w) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getZ() {
        return z;
    }

    public float getW() {
        return w;
    }

    public static Vector4f addition(Vector4f vector1, Vector4f vector2) {
        float resX = vector1.getX() + vector2.getX();
        float resY = vector1.getY() + vector2.getY();
        float resZ = vector1.getZ() + vector2.getZ();
        float resW = vector1.getW() + vector2.getW();
        return new Vector4f(resX, resY, resZ, resW);
    }

    public static Vector4f subtraction(Vector4f vector1, Vector4f vector2) {
        float resX = vector1.getX() - vector2.getX();
        float resY = vector1.getY() - vector2.getY();
        float resZ = vector1.getZ() - vector2.getZ();
        float resW = vector1.getW() - vector2.getW();
        return new Vector4f(resX, resY, resZ, resW);
    }

    public static float lengthVector4(Vector4f vector) {
        return (float) Math.sqrt(vector.getX() * vector.getX() + vector.getY() * vector.getY() + vector.getZ() * vector.getZ() + vector.getW() * vector.getW());
    }

    public static Vector4f normalize(Vector4f vector) {
        float length = lengthVector4(vector);
        if (length != 0) {
            float normalizedX = vector.getX() / length;
            float normalizedY = vector.getY() / length;
            float normalizedZ = vector.getZ() / length;
            float normalizedW = vector.getW() / length;
            return new Vector4f(normalizedX, normalizedY, normalizedZ, normalizedW);
        } else {
            return new Vector4f(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    public static Vector4f multiplication(Vector4f vector, float a) {
        float resX = vector.getX() * a;
        float resY = vector.getY() * a;
        float resZ = vector.getZ() * a;
        float rezW = vector.getW() * a;
        return new Vector4f(resX, resY, resZ, rezW);
    }

    public static Vector4f division(Vector4f vector, float a) {
        if (a == 0) {
            return new Vector4f(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            float resX = vector.getX() / a;
            float resY = vector.getY() / a;
            float resZ = vector.getZ() / a;
            float resW = vector.getW() / a;
            return new Vector4f(resX, resY, resZ, resW);

        }
    }

    public static float scalar(Vector4f vector1, Vector4f vector2) {
        return lengthVector4(vector1) * lengthVector4(vector2);
    }

}
