public class Test {

    public static int outOfBounds (int[] arr, int index) {
        return arr[index];
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int index = 5;
        try {
            System.out.println("índice [" + index + "] del array: " + outOfBounds(arr, index));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Execution done.");
        }
    }
}
