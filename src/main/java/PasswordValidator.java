public class PasswordValidator {

    public static boolean isValid(String input){
        if (input.length() > 4 && input.length() < 11){
            return true;
        } else
            return false;
    }
}
