package practice_8.Exceptions.task_3;

public class AgeChecking {
    public void ageChecker(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("Invalid age: " + age + ". Age should be between 0 and 150");
        } else {
            System.out.println("Age is correct");
        }
    }

    public static void main(String[] args) {
        AgeChecking age = new AgeChecking();

        try {
            age.ageChecker(200);
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
