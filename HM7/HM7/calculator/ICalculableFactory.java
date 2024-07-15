package lesson7.exercise1.calculator;

import lesson7.exercise1.complex.Complex;

public interface ICalculableFactory {
    Calculable create(Complex firstArg);
}
