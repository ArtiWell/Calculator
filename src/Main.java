import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            String resolvedAnswer = new Reading().resolve();
            System.out.println(resolvedAnswer);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}