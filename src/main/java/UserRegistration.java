import java.util.regex.Pattern;

public class UserRegistration {
    // user patterns
    String firstNameAndlastName="^[A-Z][a-zA-Z]{2,}$";
    String valiedEmail="^[a-zA-Z0-9[-+]]{1,}([.]?[a-zA-Z0-9]{1,})?[@]{1}[a-zA-Z0-9]{1,}[.]{1}[a-z]{2,3}([.]?[a-z]{2,3})?$";
    String moPattern="^[0-9]{2}[ ]{1}[0-9]{10}";
    String passwordPattern="^([a-zA-Z0-9]*[A-Z]+[a-zA-Z0-9]*)$";
    String passwordCharNumric="^([A-Za-z0-9]*[0-9]+[A-Za-z0-9]*[A-Z])|([A-Za-z0-9]*[A-Z]+[A-Za-z0-9]*[0-9])$";

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
    // mo validation with contry code
    public boolean mobileValidation(String monumber){
        return (Pattern.matches(moPattern,monumber));
    }

    // Password validation minimum 8 charector
    public boolean patternValidation(String password){
        if(password.length()>=8) {
            return (Pattern.matches(passwordPattern,password));
        }
        else{
            return false;
        }
    }

    // At list one Capital later and one numric
    public boolean givenPatternChackCharNumric(String password){
        if(password.length()>=8) {
            return (Pattern.matches(passwordCharNumric,password));
        }
        else{
            return false;
        }

    }

}
