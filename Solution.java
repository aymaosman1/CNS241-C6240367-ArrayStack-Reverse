package ReverseArrayStack;


import StaccksDemo.ArrayStack;

public class Solution {

    public static int[] reverseArray(int[] numbers) {

        ArrayStack<Integer> stack = new ArrayStack<>(2);

        // Push numbers into a stack
        for (int i = 0; i < numbers.length; i++) {
            stack.push(numbers[i]);
        }

        // Pop numbers from the stack
        int[] reversed = new int[numbers.length];
        int size = numbers.length;

        for (int j = 0; j < size; j++) {
            reversed[j] = stack.pop();
        }

        return reversed;
    }
}
