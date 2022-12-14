import com.blz.userRegistration.UserRegistration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    @Test
    void givenFirstName_WhenProperFirstName_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.addFirstName("Rajesh");
        Assertions.assertTrue(result);
    }

    @Test
    void givenFirstName_WhenNotProperFirstName_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.addFirstName("rajesh");
        Assertions.assertFalse(result);
    }
    @Test
    void givenFirstName_WhenProperLastName_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.addLastName("Kumar");
        Assertions.assertTrue(result);
    }

    @Test
    void givenFirstName_WhenNotProperLastName_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.addLastName("kumar");
        Assertions.assertFalse(result);
    }

}
