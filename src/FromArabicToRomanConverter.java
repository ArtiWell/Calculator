public class FromArabicToRomanConverter {

    private final String resolve;
    public FromArabicToRomanConverter(int number) {
        resolve = String.valueOf(thousands(number)) +
                hundreds(number) +
                dozens(number) +
                units(number);
    }
    private StringBuilder thousands (int number) {
        StringBuilder s = new StringBuilder();
        s.append(RomanNumerals.M.name().repeat(Math.max(0, number / 1000)));
        return s;
    }
    private StringBuilder hundreds (int numbers) {
        int numb = numbers%1000/100;
        return transformation(numb,RomanNumerals.M,RomanNumerals.C,RomanNumerals.D);
    }
    private StringBuilder dozens (int numbers) {
        int numb = numbers%100/10;
        return transformation(numb,RomanNumerals.C,RomanNumerals.X,RomanNumerals.L);
    }
    private StringBuilder units (int numbers) {
        int numb = numbers%10;
        return transformation(numb,RomanNumerals.X,RomanNumerals.I,RomanNumerals.V);
    }

    private StringBuilder transformation (int number, RomanNumerals max, RomanNumerals min, RomanNumerals average) {
        StringBuilder s = new StringBuilder();
        if (number==9){
            s.append(min.name());
            s.append(max.name());
        } else if (number>=5) {
            s.append(average.name());
            s.append(min.name().repeat(number - 5));
        } else if (number==4){
            s.append(min.name());
            s.append(average.name());
        } else {
            s.append(min.name().repeat(Math.max(0, number)));
        }
        return s;
    }


    public String getResolve() {
        return resolve;
    }
}
