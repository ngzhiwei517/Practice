package NTUT4;

import java.util.Scanner;

class UnknownOperatorException extends Exception {
    public UnknownOperatorException() {
        super("Unknown operator");
    }

    public UnknownOperatorException(char op) {
        super(op + " is an unknown operator");
    }

    public UnknownOperatorException(String message) {
        super(message);
    }
}


public class CalculatorEx {
    private double result;

    public CalculatorEx() {
        result = 0.0;
    }

    public double resultValue() {
        return result;
    }

    public void doCalculation() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the operator symbol +,-,*,/ or Q to quit");
            String input = scanner.nextLine();
            char op = input.charAt(0);
            if (op == 'Q' || op == 'q') {
                System.out.println("Final result:" + result);
                System.out.println("End of program");
                break;
            }
            System.out.println("Enter the second number:");
            double num = scanner.nextDouble();
            try {
                result = evaluate(op, result, num);
                System.out.println("updated result=" + result);
            } catch (UnknownOperatorException e) {
                System.out.println(e.getMessage());
                System.out.println("Please reenter:");
                System.out.println("Updated result:"+result);
            }

        }
    }


    public static double evaluate(char op, double n1, double n2) throws UnknownOperatorException {
        switch (op) {
            case '+':
                System.out.println("result + " + n2 + " = " + (n1 + n2));
                return n1 + n2;

            case '-':
                System.out.println("result - " + n2 + " = " + (n1 - n2));
                return n1 - n2;

            case '*':
                System.out.println("result * " + n2 + " = " + (n1 * n2));
                return n1 * n2;

            case '/':
                if (n2 == 0) {
                    throw new ArithmeticException("Denominator cannot be zero");
                }
                System.out.println("result / " + n2 + " = " + (n1 / n2));
                return n1 / n2;

            default:
                throw new UnknownOperatorException(op);
        }
    }


    public static void main(String[] args) {
        CalculatorEx calculatorEx = new CalculatorEx();
        System.out.println("Calculator in on:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Result:" + calculatorEx.resultValue());
        calculatorEx.doCalculation();
    }
}
