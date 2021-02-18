package MyDirectory;

import org.junit.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.rules.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;
    private DBConnection connection;


    public CalculatorTest() {
    }
    @Rule
    public final TestName testName = new TestName();

    @Rule
    public Timeout timeout = new Timeout(1, TimeUnit.MILLISECONDS);

    @Rule
    public TemporaryFolder folder = TemporaryFolder.builder().assureDeletion().build();



    @BeforeClass
    public void before() throws IOException {
        calculator = new Calculator();
        File file = folder.newFile("myFile.txt");
    }


//    @Test
//    @Ignore
//    public void testAdd1() {
//        System.out.println("testAdd");
//        int result = calculator.add(a, b);
//        assertEquals(expected, result);
//    }

    @Test
//    @EmptySource
//    @NullSource
    public void pushTest() throws InterruptedException {
        Thread.sleep(500);
        System.out.println("Parameterized Number is : " + 1);
    }


//    @Test
//    @Ignore
//    public void testDiv() {
//        System.out.println("testDiv");
//        int result = calculator.div(a, b);
//           // Assert.fail("Exception has not been throwed");
//
//
//    }
}