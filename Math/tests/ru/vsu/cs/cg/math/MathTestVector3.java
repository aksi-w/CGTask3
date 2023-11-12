package ru.vsu.cs.cg.math;

import org.junit.jupiter.api.Test;
import ru.vsu.cs.cg.task3.popova_p_n.Vector.Vector3f;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Vector3fTest {

    @Test
    void addition() {
        Vector3f vector1 = new Vector3f(new float[]{1.0f, 2.0f, 3.0f});
        Vector3f vector2 = new Vector3f(new float[]{4.0f, 5.0f, 6.0f});
        Vector3f vector3 = new Vector3f(new float[]{7.0f, 8.0f, 9.0f});

        Vector3f result = Vector3f.addition(vector1, vector2, vector3);

        float[] expected = {12.0f, 15.0f, 18.0f};
        assertArrayEquals(expected, result.getVector3f());
    }

    @Test
    void subtraction() {
        Vector3f vector1 = new Vector3f(new float[]{1.0f, 2.0f, 3.0f});
        Vector3f vector2 = new Vector3f(new float[]{4.0f, 5.0f, 6.0f});
        Vector3f vector3 = new Vector3f(new float[]{7.0f, 8.0f, 9.0f});

        Vector3f result = Vector3f.subtraction(vector1, vector2, vector3);

        float[] expected = {-10.0f, -11.0f, -12.0f};
        assertArrayEquals(expected, result.getVector3f());
    }

    @Test
    void lengthVector3() {
        Vector3f vector = new Vector3f(new float[]{3.0f, 4.0f, 5.0f});

        float result = Vector3f.lengthVector3(vector);

        float expected = 7.071068f; // Округленное значение длины
        assertEquals(expected, result, 0.000001); // Проверяем с заданной точностью
    }

    @Test
    void scalar() {
        Vector3f vector1 = new Vector3f(new float[]{1.0f, 2.0f, 3.0f});
        Vector3f vector2 = new Vector3f(new float[]{4.0f, 5.0f, 6.0f});
        Vector3f vector3 = new Vector3f(new float[]{7.0f, 8.0f, 9.0f});
        //float u = 60f;

        float result = Vector3f.scalar(vector1, vector2, vector3);

        float expected = 457.30957f;
        assertEquals(expected, result);
    }
    @Test
    void crossProduct() {
        Vector3f vector1 = new Vector3f(new float[]{1.0f, 2.0f, 3.0f});
        Vector3f vector2 = new Vector3f(new float[]{4.0f, 5.0f, 6.0f});
        Vector3f vector3 = new Vector3f(new float[]{7.0f, 8.0f, 9.0f});

        Vector3f result = Vector3f.crossProduct(vector1, vector2, vector3);

        float[] expected = {-3.0f, 6.0f, -3.0f};
        assertArrayEquals(expected, result.getVector3f());
    }
}

