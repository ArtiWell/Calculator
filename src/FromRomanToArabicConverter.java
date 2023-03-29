import java.util.Arrays;

public class FromRomanToArabicConverter {
    public int convert(String number) throws ConvertationRomanToArabicException {
        String[] array = number.split("");
        int[] result = new int[array.length];
        for (int i = 0; i < array.length ; i++) {
            result[i] = RomanNumerals.oneRomanNumberToArabic(array[i]);
        }
        return number(result);
    }

    private int number(int[] array) {
        int resolve = array[array.length-1];
        for (int i = array.length-1; i > 0; i--) {
            if (array[i]<=array[i-1]){
                resolve+=array[i-1];
            } else {
                resolve -=array[i-1];
            }
        }
        return resolve;
    }

}
