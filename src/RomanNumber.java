public class RomanNumber {

    private final String result;

    public RomanNumber(String[] array) throws ConvertationRomanToArabicException {
        int numberOne = new FromRomanToArabicConverter().convert(array[0]);
        int numberTwo = new FromRomanToArabicConverter().convert(array[2]);

        Integer answer = new Calculator(numberOne, numberTwo, array[1]).getResult();
        if (answer > 0) {
            result = new FromArabicToRomanConverter(answer).getResolve();

        } else {
            throw new ConvertationRomanToArabicException(answer);
        }
    }

    public String getResult() {
        return result;
    }

}
