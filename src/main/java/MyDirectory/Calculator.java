package MyDirectory;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int div(int a, int b) {
        try {
            return a/b;
        } catch (ArithmeticException e){
            throw new ArithmeticException();
        }
    }
}
