package ru.vsu.cs.cg.task3.popova_p_n.Vector;

public class Vector2f implements Vector<Vector2f>{

    private float x, y;
    private static final float eps = 1e-7f;

    public Vector2f(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }


    @Override
    public Vector2f addition(Vector2f vector1, Vector2f vector2) {
        float resX = vector1.getX() + vector2.getX();
        float resY = vector1.getY() + vector2.getY();
        return new Vector2f(resX, resY);
    }

    @Override
    public Vector2f subtraction(Vector2f vector1, Vector2f vector2) {
        float resX = vector1.getX() - vector2.getX();
        float resY = vector1.getY() - vector2.getY();
        return new Vector2f(resX, resY);
    }

    @Override
    public float lengthVector(Vector2f vector) {
        return (float) Math.sqrt(vector.getX() * vector.getX() + vector.getY() * vector.getY());
    }

    @Override
    public Vector2f normalize(Vector2f vector) {
        float length = lengthVector(vector);
        if (length > eps) {
            float normalizedX = vector.getX() / length;
            float normalizedY = vector.getY() / length;
            return new Vector2f(normalizedX, normalizedY);
        } else {
            throw new IllegalArgumentException("Division by zero is undefined");
        }
    }

    @Override
    public Vector2f multiplication(Vector2f vector, float a) {
        float resX = vector.getX() * a;
        float resY = vector.getY() * a;
        return new Vector2f(resX, resY);
    }

    @Override
    public Vector2f division(Vector2f vector, float a) {
        if (a > eps) {
            float resX = vector.getX() / a;
            float resY = vector.getY() / a;
            return new Vector2f(resX, resY);
        } else {
            throw new IllegalArgumentException("Division by zero is undefined");
        }
    }

    @Override
    public  float scalar(Vector2f vector1, Vector2f vector2) {
        return vector1.getX() * vector2.getX() + vector1.getY() * vector2.getY();
    }

}
