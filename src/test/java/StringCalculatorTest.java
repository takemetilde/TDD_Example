import org.testng.Assert;
import org.testng.annotations.Test;

public class StringCalculatorTest {

    @Test(expectedExceptions = RuntimeException.class)
    public final void whenMoreThan2NumbersAreUsed(){
        StringCalculator.add("1,2,3");
    }

    @Test(expectedExceptions = RuntimeException.class)
    public final void whenNonNumberIsUsed(){
        StringCalculator.add("1,X");
    }

    @Test
    public final void when2NumbersAreUsed(){
        Assert.assertTrue(StringCalculator.add("1,2") == 3);
    }

    @Test
    public final void whenEmptyStringIsUsed(){
        Assert.assertTrue(0 == StringCalculator.add(""));
    }

}
