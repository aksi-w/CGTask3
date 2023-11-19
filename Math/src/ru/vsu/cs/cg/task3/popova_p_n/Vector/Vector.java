package ru.vsu.cs.cg.task3.popova_p_n.Vector;

public interface Vector<T> {
    public T addition(T vector1, T vector2);
    public T subtraction(T vector1, T vector2);
    public float lengthVector(T vector);
    public T normalize(T vector);
    public T multiplication(T vector, float a);
    public T division(T vector, float a);
    public float scalar(T vector1, T vector2);
}
