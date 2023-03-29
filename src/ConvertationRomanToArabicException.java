public class ConvertationRomanToArabicException extends Exception {


    public ConvertationRomanToArabicException(String invalidNumber) {
        super("Invalid number: "+invalidNumber);
    }
    public ConvertationRomanToArabicException(String invalidNumber1,String invalidNumber2) {
        super("Invalid numbers: "+invalidNumber1+" and "+invalidNumber2);
    }
    public ConvertationRomanToArabicException(int number) {
        super("result is less than or equal to zero "+number);
    }

    public ConvertationRomanToArabicException() {
        super("throws Exception");
    }
}
