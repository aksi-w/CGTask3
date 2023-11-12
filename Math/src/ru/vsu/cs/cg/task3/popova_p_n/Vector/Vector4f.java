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

    public static Vector4f addition(Vector4f vector1, Vector4f vector2, Vector4f vector3, Vector4f vector4) {
        float resX = vector1.getX() + vector2.getX() + vector3.getX() + vector4.getX();
        float resY = vector1.getY() + vector2.getY() + vector3.getY() + vector4.getY();
        float resZ = vector1.getZ() + vector2.getZ() + vector3.getZ() + vector4.getZ();
        float resW = vector1.getW() + vector2.getW() + vector3.getW() + vector4.getW();
        return new Vector4f(resX, resY, resZ, resW);
    }

    public static Vector4f subtraction(Vector4f vector1, Vector4f vector2, Vector4f vector3, Vector4f vector4) {
        float resX = vector1.getX() - vector2.getX() - vector3.getX() - vector4.getX();
        float resY = vector1.getY() - vector2.getY() - vector3.getY() - vector4.getY();
        float resZ = vector1.getZ() - vector2.getZ() - vector3.getZ() - vector4.getZ();
        float resW = vector1.getW() - vector2.getW() - vector3.getW() - vector4.getW();
        return new Vector4f(resX, resY, resZ, resW);
    }

    public static float lengthVector3(Vector4f vector) {
        return (float) Math.sqrt(vector.getX() * vector.getX() + vector.getY() * vector.getY() + vector.getZ() * vector.getZ() + vector.getW() * vector.getW());
    }

    public static Vector4f normalize(Vector4f vector) {
        float length = lengthVector3(vector);
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

    public static float scalar(Vector4f vector1, Vector4f vector2, Vector4f vector3, Vector4f vector4, float u) {
        float uU = (float) Math.toRadians(u);
        return lengthVector3(vector1) * lengthVector3(vector2) * lengthVector3(vector3) * lengthVector3(vector4) * (float) Math.cos(uU);
    }

    public static float scalar(Vector4f vector1, Vector4f vector2, Vector4f vector3, Vector4f vector4) {
        return lengthVector3(vector1) * lengthVector3(vector2) * lengthVector3(vector3) * lengthVector3(vector4);
    }

}
