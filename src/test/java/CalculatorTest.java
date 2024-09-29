import org.example.Main;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class CalculatorTest {
    private Main calculator;
    @Before
    public void setUp() { calculator = new Main();}
    @Test
    public void test_add_positive(){
        double a= 4;
        double b= 4;
        double expectedResult=8;
        Assert.assertEquals(expectedResult,calculator.add(a,b),0.002);
    }
    @Test
    public void test_add_negative(){
        double a= -4;
        double b= -4;
        double expectedResult=-8;
        Assert.assertEquals(expectedResult,calculator.add(a,b),0.002);
    }
    @Test
    public void test_sub_positive(){
        double a= 4;
        double b= 4;
        double expectedResult=0;
        Assert.assertEquals(expectedResult,calculator.sub(a,b),0.002);
    }
    @Test
    public void test_sub_negative(){
        double a= -4;
        double b= -4;
        double expectedResult=0;
        Assert.assertEquals(expectedResult,calculator.sub(a,b),0.002);
    }
    @Test
    public void test_factorial(){
        int a= 3;
        int expectedResult=6;
        Assert.assertEquals(expectedResult,calculator.factorial(a));
    }
}
