
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


        System.out.println("\n=== More Examples ===");

        System.out.println("Example 1: " +
                java.util.Arrays.toString(
                        ReverseArray.reverseArray(
                                new int[]{101, 102, 103, 104, 105})));

        System.out.println("Example 2: " +
                java.util.Arrays.toString(
                        ReverseArray.reverseArray(
                                new int[]{10, 20, 30})));

        System.out.println("Example 3: " +
                java.util.Arrays.toString(
                        ReverseArray.reverseArray(
                                new int[]{700,800,900})));


        System.out.println("\n=== Bonus Challenge ===");

        int[] bonus = {10, 20, 30, 40, 50};

        int[] bonusResult = ReverseArray.reverseFirstK(bonus, 3);

        System.out.println("Original Array: " +
                java.util.Arrays.toString(bonus));

        System.out.println("Reverse First 3: " +
                java.util.Arrays.toString(bonusResult));
    }
}
