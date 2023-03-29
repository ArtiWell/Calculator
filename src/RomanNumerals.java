public enum RomanNumerals {
    I(1),V(5),X(10),L(50),C(100),D(500),M(1000);

    private int value;
    RomanNumerals(int value) {
        this.value = value;
    }
    public int getValue(){
        return value;
    }
    public static int oneRomanNumberToArabic(String number) throws ConvertationRomanToArabicException{
        try {
            return RomanNumerals.valueOf(number).getValue();
        } catch (IllegalArgumentException e){
            throw new ConvertationRomanToArabicException(number);
        }

    }
}
