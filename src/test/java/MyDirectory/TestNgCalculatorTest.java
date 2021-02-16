package MyDirectory;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class TestNgCalculatorTest {

    private static Calculator calculator;


    @BeforeClass
    public static void initialazing() {
        calculator = new Calculator();
    }

    @DataProvider(name = "Numbers for add")
    public static Object[][] addNumbers() {
        return new Object[][]{{1, 2, 3}, {3, 4, 7}, {8, 9, 17}};
    }

    @Test(dataProvider = "Numbers for add")
    public void testAdd(int a, int b, int expected) {
        System.out.println("testAdd");
        int result = calculator.add(a, b);
        Assert.assertEquals(expected, result);

    }

    @Test(dataProvider = "Numbers for add")
    public void pushTest(int a, int b, int expected) {
        System.out.println("Parameterized Number is : " + a);
    }

//    @Ignore
//    @Test
//    public void testDiv() {
//        System.out.println("testDiv");
//        int result = calculator.div(a, b);
//        assertEquals(expected, result);
//    }
}