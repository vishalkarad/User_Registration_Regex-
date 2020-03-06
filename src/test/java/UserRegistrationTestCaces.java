import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTestCaces {
    UserRegistration obj=new UserRegistration();
    String emailArray[]={"abc@yahoo.com","abc-100@yahoo.com","abc.100@yahoo.com","abc111@abc.com",
            "abc-100@abc.net","abc.100@abc.com.au","abc@1.com","abc@gmail.com.com","abc+100@gmail.com"};
    String inValidEmailArray[]={"abc","abc@.com.my","abc123@gmail.a","abc123@.com","abc123@.com.com,",".abc@abc.com",
            "abc()*@gmail.com","abc@%*.com","abc..2002@gmail.com","abc.@gmail.com","abc@abc@gmail.com","abc@gmail.com.1a","abc@gmail.com.aa.au"};

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
        for(int index1=0;index1<emailArray.length;index1++){
            boolean email=obj.emailValidation(emailArray[index1]);
            Assert.assertTrue(email);
        }
    }
    // Check Optional also valid
    @Test
    public void givenEmailValid_whenOptionalField_thenReturnTrue() {
        for(int index1=0;index1<emailArray.length;index1++){
            boolean email=obj.emailValidation(emailArray[index1]);
            Assert.assertTrue(email);
        }

    }
    // Email are not valid when mandatory parts are not enterd (@)
    @Test
    public void givenEmailInValid_whenNotFildMandatoryParts_thenReturnFalse() {
        for(int index1=0;index1<inValidEmailArray.length;index1++){
            boolean email=obj.emailValidation(inValidEmailArray[index1]);
            Assert.assertFalse(email);
        }
    }
    //Check mo number and contry code
    @Test
    public void givenMovalidation_WhenContrycodAndTenDigitNumber_Then_Valid() {
        boolean moNumber=obj.mobileValidation("91 8956561212");
        Assert.assertTrue(moNumber);
    }
    //Contry code and space are not enterd then condition is false
    @Test
    public void givenInValid_WhenContrycodeAreNotEnterd_ThenFalse() {
        boolean moNumber=obj.mobileValidation("8956561212");
        Assert.assertFalse(moNumber);
    }

    // Password validation minimum 8 charector
    @Test
    public void givenValid_WhenCaractorLengthIsMinimum8_ThenTrue() {
        boolean passWord=obj.patternValidation("Vishalkard");
        Assert.assertTrue(passWord);
    }

    // Password length less than 8 charector then false
    @Test
    public void givenInValid_WhenCaractorLengthIsLessThan8_ThenFalse() {
        boolean passWord=obj.patternValidation("Vishal");
        Assert.assertFalse(passWord);
    }

    // Should have at list one upper case and minimum leangth is 8
    @Test
    public void givenValid_WhenCaractorAtlistOneCapital_ThenTrue() {
        boolean passWord=obj.patternValidation("vishAlkard");
        Assert.assertTrue(passWord);
    }
    // No upper case then false
    @Test
    public void givenInValid_WhenCaractorNotAtlistOneCapital_Thenfalse() {
        boolean passWord=obj.patternValidation("vishalkard");
        Assert.assertFalse(passWord);
    }

    // Atlist one numric and one Capital later
    @Test
    public void givenValid_WhenAtlistOneCharAndNumric_ThenTrue(){
        boolean result=obj.givenPatternChackCharNumric("Vishal123");
        Assert.assertTrue(result);
    }
    // Atlist no one numric and one Capital later
    @Test
    public void giveninValid_WhenAtlistNoOneCharAndNumric_ThenFalse(){
        boolean result=obj.givenPatternChackCharNumric("vishal123");
        Assert.assertFalse(result);
    }
    // Strong Password
    @Test
    public void passValidation() {
        boolean password=obj.StrongPassWordValidation("Vis#halsdffsd14");
        Assert.assertTrue(password);
    }
}