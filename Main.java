
package ReverseArrayStack;

public class Main {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("===Main Problem===");

        int[] numbers = {101, 102, 103, 104, 105};

        int[] result = ReverseArray.reverseArray(numbers);

        System.out.println("Original Array: " +
                java.util.Arrays.toString(numbers));

        System.out.println("Reversed Array: " +
                java.util.Arrays.toString(result));

        System.out.println();

        System.out.println("=== Bonus Challenge ===");

        int[] bonus = {10, 20, 30, 40, 50};

        int[] bonusResult = ReverseArray.reverseFirstK(bonus, 3);

        System.out.println("Original Array: " +
                java.util.Arrays.toString(bonus));

        System.out.println("Reverse First 3: " +
                java.util.Arrays.toString(bonusResult));
    }
}
