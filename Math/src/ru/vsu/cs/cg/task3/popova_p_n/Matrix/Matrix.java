package ru.vsu.cs.cg.task3.popova_p_n.Matrix;

import ru.vsu.cs.cg.task3.popova_p_n.Vector.Vector;

public interface Matrix<T> {
    public T addition(T matrix1, T matrix2);
    public T subtraction(T matrix1, T matrix2);
    public T multiplication(T matrix1, T matrix2);
    public T transposition(T matrix);
    public T zeroMatrix();
    public T unitMatrix();

}
