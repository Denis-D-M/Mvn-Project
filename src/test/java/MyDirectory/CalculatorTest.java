package MyDirectory;

import org.junit.*;
import org.junit.rules.TestRule;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class CalculatorTest {
    int a;
    int b;
    int expected;

    private Calculator calculator;


    public CalculatorTest(int number1, int number2, int expected) {
        a = number1;
        b = number2;
        this.expected = expected;
    }

    @Rule
    public TestRule testRule = new Timeout(50, TimeUnit.MILLISECONDS);

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Parameterized.Parameters
    public static Object[][] collection(){
        return new Object[][] {{1, 2, 3},{2, 4, 6},{3, 6, 9},{5,3,8}};
    }

    @Test
    public void testAdd1() {
        System.out.println("testAdd");
        int result = calculator.add(a, b);
        assertEquals(expected, result);
    }

    @Test
    public void pushTest() {
        System.out.println("Parameterized Number is : " + a);
    }


    @Test
    public void testDiv() {
        System.out.println("testDiv");
        int result = calculator.div(a, b);
        assertEquals(expected, result);
    }
}