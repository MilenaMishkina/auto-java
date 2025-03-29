package practice_8.Exceptions.task_4;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class EmailValidator {
    public static boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
        Matcher matcher = pattern.matcher(email);

        if (!matcher.matches()) {
            throw new InvalidEmailException("Неверный формат email: " + email);
        }

        return true;
    }

    public static void main(String[] args) {
        try {
            System.out.println(EmailValidator.validateEmail("test@example.com")); // Валидный email
            System.out.println(EmailValidator.validateEmail("invalid-email"));   // Неверный email
        } catch (InvalidEmailException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}

