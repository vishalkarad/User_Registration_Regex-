import java.util.regex.Pattern;

public class UserRegistration {
    // user patterns
    String firstNameAndlastName="^[A-Z][a-zA-Z]{2,}$";
    String valiedEmail="^[a-zA-Z]{1,}([.]?[a-zA-Z]{1,})?[@]{1}[a-zA-Z]{1,}[.]{1}[a-z]{2}([.]?[a-z]{2})?$";
    String moPattern="^[0-9]{2}[ ]{1}[0-9]{10}";

    public static void main(String[] args) {
        System.out.println("***************Welcome To User Registration***************");
    }
    //Check First name and last name
    public boolean nameValidation(String name) {
        return (Pattern.matches(firstNameAndlastName,name));
    }
    // Check Email validationn
    public boolean emailValidation(String email) {
        return (Pattern.matches(valiedEmail,email));
    }
    public boolean mobileValidation(String monumber){
        return (Pattern.matches(moPattern,monumber));
    }

}
