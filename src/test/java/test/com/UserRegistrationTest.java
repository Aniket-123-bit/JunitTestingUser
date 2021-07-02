package test.com;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.Assert;
import com.test.UserRegistration;

public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();
    @Test
    public void givenFirstName_WhenProper_ReturnTrue() {
        boolean result = userRegistration.validFirstName("Aniket");
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenProper_ReturnTrue() {
        boolean result = userRegistration.validLastName("Raikwar");
        Assert.assertTrue(result);
    }

    @Test
    public void givenMobile_WhenProper_ReturnTrue() {
        boolean result = userRegistration.validateMobile("91 9922445588");
        Assert.assertTrue(result);
    }

    @Test
    public void givenEmail_WhenProper_ReturnTrue() {
        boolean result = userRegistration.validateEmail("abc@123gmail.com");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenProper_ReturnTrue() {
        boolean result = userRegistration.validatePassword("Aniket@123");
        Assert.assertTrue(result);
    }

}
