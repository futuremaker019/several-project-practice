package org.example.calculator.handler;

import org.example.calculator.PositiveNumber;

public interface NewArithmeticOperator {

    boolean support(String operator);
    int calculate(PositiveNumber operand1, PositiveNumber operand2);
}
