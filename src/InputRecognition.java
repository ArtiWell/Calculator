public class InputRecognition {
    private final int resolve;

    public int getResolve() {
        return resolve;
    }

    public InputRecognition(String[] array) {
        resolve = Integer.compare(arabOrRim(array[0]) + arabOrRim(array[2]), 0);
    }
    private int arabOrRim (String arr) {
        try {
            Integer.parseInt(arr);
            return 1;
        } catch (NumberFormatException e) {
            return -1;
        }

    }

}
