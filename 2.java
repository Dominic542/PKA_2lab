public class CleanCodeExample {

    public static void useConsistentFormatting() {
        int i = 5;
        int j = 10;
        System.out.println("Sum: " + sum(i, j));
    }
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        int sum = x + y;
        System.out.println("Sum: " + sum);

        if (y > x) {
            System.out.println("y is greater than x");
        } else {
            System.out.println("x is greater than or equal to y");
        }
        separateCodeIntoMethods();
        useConsistentFormatting();
        avoidMagicNumbers();
        handleExceptionProperly();
    }
    public static void separateCodeIntoMethods() {
        int num1 = 5;
        int num2 = 7;
        int total = sum(num1, num2);
        System.out.println("Sum: " + total);
    }
    public static void avoidMagicNumbers() {
        int sum = calculateSumUpTo(10);
        System.out.println("Sum: " + sum);
    }
    public static void handleExceptionProperly() {
        int dividend = 10;
        int divisor = 0;

        try {
            int result = divide(dividend, divisor);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
    private static int sum(int num1, int num2) {
        return num1 + num2;
    }
    private static int calculateSumUpTo(int limit) {
        int sum = 0;
        for (int i = 0; i <= limit; i++) {
            sum += i;
        }
        return sum;
    }
    private static int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return dividend / divisor;
    }
}
