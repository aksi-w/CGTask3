package ru.vsu.cs.cg.task3.popova_p_n.Vector;

public class Vector3f {

    private float x, y, z;
    private static final float eps = 1e-7f;

    public Vector3f(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
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

    public Vector3f addition(Vector3f vector1, Vector3f vector2) {
        float resX = vector1.getX() + vector2.getX();
        float resY = vector1.getY() + vector2.getY();
        float resZ = vector1.getZ() + vector2.getZ();
        return new Vector3f(resX, resY, resZ);
    }

    public Vector3f subtraction(Vector3f vector1, Vector3f vector2) {
        float resX = vector1.getX() - vector2.getX();
        float resY = vector1.getY() - vector2.getY();
        float resZ = vector1.getZ() - vector2.getZ();
        return new Vector3f(resX, resY, resZ);
    }

    public float lengthVector(Vector3f vector) {
        return (float) Math.sqrt(vector.getX() * vector.getX() + vector.getY() * vector.getY() + vector.getZ() * vector.getZ());
    }

    public Vector3f normalize(Vector3f vector) {
        float length = lengthVector(vector);
        if (length > eps) {
            float normalizedX = vector.getX() / length;
            float normalizedY = vector.getY() / length;
            float normalizedZ = vector.getZ() / length;
            return new Vector3f(normalizedX, normalizedY, normalizedZ);
        } else {
            throw new IllegalArgumentException("Division by zero is undefined");
        }
    }

    public Vector3f multiplication(Vector3f vector, float a) {
        float resX = vector.getX() * a;
        float resY = vector.getY() * a;
        float resZ = vector.getZ() * a;
        return new Vector3f(resX, resY, resZ);
    }

    public Vector3f division(Vector3f vector, float a) {
        if (a < eps) {
            throw new IllegalArgumentException("Division by zero is undefined");
        } else {
            float resX = vector.getX() / a;
            float resY = vector.getY() / a;
            float resZ = vector.getZ() / a;
            return new Vector3f(resX, resY, resZ);
        }
    }

     public float scalar(Vector3f vector1, Vector3f vector2) {
        return vector1.getX() * vector2.getX() + vector1.getY() * vector2.getY() + vector1.getZ() * vector2.getZ();
    }

    public Vector3f cross(Vector3f other) {
        float resX = this.y * other.z - this.z * other.y;
        float resY = this.x * other.z - this.z * other.x;
        float resZ = this.x * other.y - this.y * other.x;

        return new Vector3f(resX, resY, resZ);
    }

}
