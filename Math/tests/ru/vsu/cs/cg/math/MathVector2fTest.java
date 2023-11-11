package ru.vsu.cs.cg.math;

import org.junit.jupiter.api.Test;
import ru.vsu.cs.cg.task3.popova_p_n.Vector.Vector2f;

import static org.junit.jupiter.api.Assertions.*;

class MathVector2fTest {

    @Test
    void addition() {
        Vector2f vector1 = new Vector2f(new float[]{1.0f, 2.0f});
        Vector2f vector2 = new Vector2f(new float[]{3.0f, 4.0f});
        Vector2f result = Vector2f.addition(vector1, vector2);
        assertArrayEquals(new float[]{4.0f, 6.0f}, result.getVector2());
    }

    @Test
    void subtraction() {
        Vector2f vector1 = new Vector2f(new float[]{3.0f, 4.0f});
        Vector2f vector2 = new Vector2f(new float[]{1.0f, 2.0f});
        Vector2f result = Vector2f.subtraction(vector1, vector2);
        assertArrayEquals(new float[]{2.0f, 2.0f}, result.getVector2());
    }

    @Test
    void lengthVector() {
        Vector2f vector = new Vector2f(new float[]{8.0f, 6.0f});
        float length = Vector2f.lengthVector(vector);
        assertEquals(10.0f, length);
    }

    @Test
    void normalize() {
        Vector2f vector = new Vector2f(new float[]{3.0f, 4.0f});
        Vector2f normalized = Vector2f.normalize(vector);
        float[] expected = new float[]{0.6f, 0.8f};
        assertArrayEquals(expected, normalized.getVector2());
    }

    @Test
    void multiplication() {
        Vector2f vector = new Vector2f(new float[]{2.0f, 3.0f});
        Vector2f result = Vector2f.multiplication(vector, 2.0f);
        assertArrayEquals(new float[]{4.0f, 6.0f}, result.getVector2());
    }

    @Test
    void division() {
        Vector2f vector = new Vector2f(new float[]{4.0f, 6.0f});
        Vector2f result = Vector2f.division(vector, 2.0f);
        assertArrayEquals(new float[]{2.0f, 3.0f}, result.getVector2());
    }

    @Test
    void scalar() {
        Vector2f vector1 = new Vector2f(new float[]{6.0f, 8.0f});
        Vector2f vector2 = new Vector2f(new float[]{3.0f, 4.0f});

        float result = Vector2f.scalar(vector1, vector2, 60f);
        assertEquals(25, result);
    }

    @Test
    void testScalar() {
        Vector2f vector1 = new Vector2f(new float[]{6.0f, 8.0f});
        Vector2f vector2 = new Vector2f(new float[]{3.0f, 4.0f});

        float result = Vector2f.scalar(vector1, vector2);
        assertEquals(50, result);
    }
}
