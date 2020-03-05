import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTestCaces {
    UserRegistration obj=new UserRegistration();

    // Check to first name is valid
    @Test
    public void givenFirstName_whenValid_thenReturn(){
        boolean firstName=obj.nameValidation("Vishal");
        Assert.assertTrue(firstName);
    }
    // Check to first name is not valid
    @Test
    public void givenFirsName_whenInvalid_thenReturn() {
        boolean firstName=obj.nameValidation("vishal");
        Assert.assertFalse(firstName);
    }
}