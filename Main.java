package ReverseArrayStack;



public class Main {

    public static void main(String[] args) {

        int[] numbers = {101, 102, 103, 104, 105};

        int[] result = Solution.reverseArray(numbers);

        System.out.print("Original Array: ");


        for (int num : numbers) {
            System.out.print(num + " ");
        }

        System.out.println();

        System.out.print("Reversed Array: ");


        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}


