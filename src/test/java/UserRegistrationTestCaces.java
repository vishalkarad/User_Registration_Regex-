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
    // Check to last name is valid
    @Test
    public void givenLastName_whenValid_thenReturn() {
        boolean lastName=obj.nameValidation("Karad");
        Assert.assertTrue(lastName);
    }
    // Check to last name is not valid
    @Test
    public void givenLastname_whenInvalid_thenReturn() {
        boolean lastName=obj.nameValidation("kard");
        Assert.assertFalse(lastName);
    }

    // Check Email is valid
    @Test
    public void givenEmailValid_whenMandetoryField_thenReturnTrue() {
        boolean email=obj.emailValidation("ab@cbl.co");
        Assert.assertTrue(email);
    }
    // Check Optional also valid
    @Test
    public void givenEmailValid_whenOptionalField_thenReturnTrue() {
        boolean email=obj.emailValidation("abc.xyz@bl.co.in");
        Assert.assertTrue(email);
    }
    // Email are not valid when mandatory parts are not enterd (@)
    @Test
    public void givenEmailInValid_whenNotFildMandatoryParts_thenReturnFalse() {
        boolean email=obj.emailValidation("abcbl.co");
        Assert.assertFalse(email);
    }
}