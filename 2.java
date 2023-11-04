public class DirtyCodeExample {
    public static void main(String args[])
    {int x=10;
        int y=20;System.out.println(x+y);if(y>x)System.out.println("y is greater than x");else
        System.out.println("x is greater than or equal to y");}

    private void DisplayTheSum(int sum) {
        System.out.println("The sum is: " + sum);
    }

    private void sum(int num1, int num2) {
        int result = num1 + num2;
    }

    private void dontUseMeaningfulVariableNames() {
        int a = 5;
        int b = 7;
    }
    
    public void useSingleCharacterVariableNames() {
        int a = 10;
        int b = 20;
    }

    public void putAllCodeInSingleMethod() {
        int num1 = 5;
        int num2 = 7;
        int total = num1 + num2;
        System.out.println("Total: " + total);
    }

    public void useInconsistentFormatting(){int i=5;
        int j=10;System.out.println(i+j);}

    public void useMagicNumbers() {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
    }

    public void ignoreExceptionHandling() {
        int dividend = 10;
        int divisor = 0;
        int result = dividend / divisor;
    }
}
