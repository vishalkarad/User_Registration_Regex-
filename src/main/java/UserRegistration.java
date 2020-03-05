import java.util.regex.Pattern;

public class UserRegistration {
    // user patterns
    String firstNameAndlastName="^[A-Z][a-zA-Z]{2,}$";
    String valiedEmail="^[a-zA-Z]{1,}([.]?[a-zA-Z]{1,})?[@]{1}[a-zA-Z]{1,}[.]{1}[a-z]{2}([.]?[a-z]{2})?$";
    public static void main(String[] args) {
        System.out.println("***************Welcome To User Registration***************");
    }

    public boolean nameValidation(String name) {
        return (Pattern.matches(firstNameAndlastName,name));
    }

    public boolean emailValidation(String email) {
        return (Pattern.matches(valiedEmail,email));
    }
}
