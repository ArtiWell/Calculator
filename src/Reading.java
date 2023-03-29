import java.util.Scanner;

public class Reading {
    public String resolve() throws ConvertationRomanToArabicException {
        Scanner scanner = new Scanner(System.in);
        String[] arithmetic = scanner.nextLine().split(" ");
        scanner.close();
        if (arithmetic.length==3){
            int recognition = new InputRecognition(arithmetic).getResolve();
            if (recognition > 0){
                return new Calculator(arithmetic).getResult().toString();

            } else if (recognition < 0) {
                return new RomanNumber(arithmetic).getResult();

            } else {
                throw new ConvertationRomanToArabicException(arithmetic[0], arithmetic[2]);
            }
        } else {
            throw new ConvertationRomanToArabicException();
        }
    }
}
