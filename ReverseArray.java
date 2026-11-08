package ReverseArrayStack;


import StaccksDemo.ArrayStack;

public class ReverseArray {

    public static int[] reverseArray(int[] numbers) {

        ArrayStack<Integer> stack = new ArrayStack<>(2);

        // Step 1: Push numbers into a stack
        for (int number : numbers) {
            stack.push(number);
        }

        // Step 2: Pop numbers from the stack
        int[] reversed = new int[numbers.length];

        int j = 0;

        while (!stack.isEmpty()) {
            reversed[j] = stack.pop();
            j++;
        }

        return reversed;
    }

    // Bonus Challenge: Reverse only first K elements
    public static int[] reverseFirstK(int[] numbers, int k) {

        if (k > numbers.length) {
            k = numbers.length;
        }

        if (k <= 0) {
            return numbers.clone();
        }

        ArrayStack<Integer> stack = new ArrayStack<>(2);

        int[] result = numbers.clone();

        // Step 1: Push first K elements
        for (int i = 0; i < k; i++) {
            stack.push(numbers[i]);
        }

        // Step 2: Pop elements into the array
        int i = 0;

        while (!stack.isEmpty()) {
            result[i] = stack.pop();
            i++;
        }

        return result;
    }
}

