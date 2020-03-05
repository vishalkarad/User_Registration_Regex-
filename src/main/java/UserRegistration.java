import java.util.regex.Pattern;

public class UserRegistration {
    // user patterns
    String firstNameAndlastName="^[A-Z][a-zA-Z]{2,}$";

    public static void main(String[] args) {
        System.out.println("***************Welcome To User Registration***************");
    }

    public boolean nameValidation(String name) {
        return (Pattern.matches(firstNameAndlastName,name));
    }
}
