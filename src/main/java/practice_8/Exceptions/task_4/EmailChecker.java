package practice_8.Exceptions.task_4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailChecker {
    public static void validateEmail(String email) {
        Pattern pattern = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
        Matcher matcher = pattern.matcher(email);

        if (!matcher.matches()) {
            throw new InvalidEmailException("Incorrect email format: " + email);
        } else {
            System.out.println("Email is correct: " + email);
        }
    }

    public static void main(String[] args) {
        try {
            EmailChecker.validateEmail("test@mail.ru");
            EmailChecker.validateEmail("test2.ru");
        } catch (InvalidEmailException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
