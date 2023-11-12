package ru.vsu.cs.cg.task3.popova_p_n.Vector;

public class Vector3f {

    private float x, y, z;

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

    public static Vector3f addition(Vector3f vector1, Vector3f vector2, Vector3f vector3) {
        float resX = vector1.getX() + vector2.getX() + vector3.getX();
        float resY = vector1.getY() + vector2.getY() + vector3.getY();
        float resZ = vector1.getZ() + vector2.getZ() + vector3.getZ();
        return new Vector3f(resX, resY, resZ);
    }

    public static Vector3f subtraction(Vector3f vector1, Vector3f vector2, Vector3f vector3) {
        float resX = vector1.getX() - vector2.getX() - vector3.getX();
        float resY = vector1.getY() - vector2.getY() - vector3.getY();
        float resZ = vector1.getZ() - vector2.getZ() - vector3.getZ();
        return new Vector3f(resX, resY, resZ);
    }

    public static float lengthVector3(Vector3f vector) {
        return (float) Math.sqrt(vector.getX() * vector.getX() + vector.getY() * vector.getY() + vector.getZ() * vector.getZ());
    }

    public static Vector3f normalize(Vector3f vector) {
        float length = lengthVector3(vector);
        if (length != 0) {
            float normalizedX = vector.getX() / length;
            float normalizedY = vector.getY() / length;
            float normalizedZ = vector.getZ() / length;
            return new Vector3f(normalizedX, normalizedY, normalizedZ);
        } else {
            return new Vector3f(0.0f, 0.0f, 0.0f);
        }
    }

    public static Vector3f multiplication(Vector3f vector, float a) {
        float resX = vector.getX() * a;
        float resY = vector.getY() * a;
        float resZ = vector.getZ() * a;
        return new Vector3f(resX, resY, resZ);
    }

    public static Vector3f division(Vector3f vector, float a) {
        if (a == 0) {
            return new Vector3f(0.0f, 0.0f, 0.0f);
        } else {
            float resX = vector.getX() / a;
            float resY = vector.getY() / a;
            float resZ = vector.getZ() / a;
            return new Vector3f(resX, resY, resZ);

        }
    }

    public static float scalar(Vector3f vector1, Vector3f vector2, Vector3f vector3, float angleDegrees) {
        float angleRadians = (float) Math.toRadians(angleDegrees);
        return lengthVector3(vector1) * lengthVector3(vector2) * lengthVector3(vector3) * (float) Math.cos(angleRadians);
    }

    public static float scalar(Vector3f vector1, Vector3f vector2, Vector3f vector3) {
        return lengthVector3(vector1) * lengthVector3(vector2) * lengthVector3(vector3);
    }

    public Vector3f cross(Vector3f other) {
        float resX = this.y * other.z - this.z * other.y;
        float resY = this.z * other.x - this.x * other.z;
        float resZ = this.x * other.y - this.y * other.x;

        return new Vector3f(resX, resY, resZ);
    }
}
