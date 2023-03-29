public class Calculator {

    private final Integer result;

    public Calculator(String[] array) {
        int numberOne = Integer.parseInt(array[0]);
        int numberTwo = Integer.parseInt((array[2]));
        result = arithmetic(numberOne, numberTwo, array[1]);
    }

    public Calculator(int numberOne, int numberTwo, String operator) {
        result = arithmetic(numberOne, numberTwo, operator);
    }

    private int arithmetic(int numberOne, int numberTwo, String operator) {
        switch (operator) {
            case "+":
                return numberOne + numberTwo;
            case "-":
                return numberOne - numberTwo;
            case "*":
                return numberOne * numberTwo;
            case "/":
                if (numberTwo != 0) {
                    return numberOne / numberTwo;
                } else {
                    throw new ArithmeticException("Error: division by zero");
                }
            default:
                throw new IllegalArgumentException("Error: invalid operator");
        }
    }

    public Integer getResult() {
        return result;
    }

}
