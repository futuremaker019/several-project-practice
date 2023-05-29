package org.example.calculator;

import org.example.calculator.handler.*;

import java.util.List;

public class Calculator {
//    public static int calculate(int operand1, String operator, int operand2) {
//        if ("+".equals(operator)) {
//            return operand1 + operand2;
//        } else if ("-".equals(operator)) {
//            return operand1 - operand2;
//        } else if ("*".equals(operator)) {
//            return operand1 * operand2;
//        } else if ("/".equals(operator)) {
//            return operand1 / operand2;
//        }
//
//        return 0;
//    }

    /**
     * enum을 사용한 계산기 구현
     */
//    public static int calculate(int operand1, String operator, int operand2) {
//        return ArithmeticOperator.calculate(operand1, operator, operand2);
//    }

    private static final List<NewArithmeticOperator> arithmeticOperators
            = List.of(new Addition(), new Subtraction(), new Multiplication(), new Division());

    public static int calculate(PositiveNumber operand1, String operator, PositiveNumber operand2) {
        return arithmeticOperators.stream()
                .filter(arithmeticOperator -> arithmeticOperator.support(operator))
                .map(arithmeticOperator -> arithmeticOperator.calculate(operand1, operand2))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("올바른 사칙연산이 아닙니다."));
    }
}
