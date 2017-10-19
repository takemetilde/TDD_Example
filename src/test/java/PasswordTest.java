import org.testng.Assert;
import org.testng.annotations.Test;

public class PasswordTest {

    @Test
    public static void shouldBeValidPasswordBetweenFiveAndTen(){
        Assert.assertTrue(PasswordValidator.isValid("Abc123"));
    }

}
