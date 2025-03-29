package practice_8.Exceptions.task_3;

public class AgeChecking {
    public boolean checkAge(int userAge) throws InvalidAgeException {
        if(userAge < 0 || userAge > 150) {
            throw new InvalidAgeException("Неверный возраст: " + userAge + ". Возраст должен быть от 0 до 150 лет");
        } else {
            System.out.println("Возраст пользователя подходит под условия");
        }
        return true;
    }

    public static void main(String[] args) throws InvalidAgeException {
        AgeChecking age = new AgeChecking();
        try {
            System.out.println(age.checkAge(200));
        } catch (InvalidAgeException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
