import java.util.Scanner;

class TestingFromRightToLeftAccessOfHighestAndLowestRepeatingDigit {
    public static void main(String args[]) {
        System.out.println("Enter Number: ");
        int num = new Scanner(System.in).nextInt();
        int divr = 1;
        int temp = num;

        // Calculate the divisor to determine the highest power of 10
        while (temp >= 10) {
            temp /= 10;
            divr *= 10;
        }

        int max = 0, min = Integer.MAX_VALUE, hdigits = 0, lDigits = 0;

        // Loop through digits 0 to 9 to count occurrences
        for (int i = 0; i <= 9; i++) {
            int count = 0;
            int number = num;  // Reset number for each digit check

            // Extract digits from right to left
            while (number > 0) {
                int rem = number % 10;  // Extract the rightmost digit
                if (i == rem) {
                    count++;
                }
                number /= 10;  // Move to the next digit
            }

            // Update the highest repeating digit
            if (count > max) {
                max = count;
                hdigits = i;
            }

            // Update the lowest repeating digit (only if the digit appeared at least once)
            if (count < min && count != 0) {
                min = count;
                lDigits = i;
            }
        }

        System.out.println("Highest Repeated Digit: " + hdigits);
        System.out.println("Lowest Repeated Digit: " + lDigits);
    }
}
