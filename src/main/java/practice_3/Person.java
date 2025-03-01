package practice_3;

public class Person {
    private String firstName;
    private String lastName;
    private final String ssn;

    public Person(String firstNameValue, String lastNameValue, String ssnValue) {
        firstName =  firstNameValue;
        lastName = lastNameValue;
        ssn = ssnValue;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSsn() {
        return ssn;
    }

    public void setFirstName(String newName) {
        firstName = newName;
    }

    public void setLastName(String newLastName) {
        lastName = newLastName;
    }

    public void printPersonInfo(){
        System.out.println("Name: " + firstName + ". " + "Lastname: " + lastName + ". " + "SSN: " + ssn);
    }

    public static void main(String[] args) {
        Person person1 = new Person("Milena", "Mishkina", "123-45-6789");
        Person person2 = new Person("Ivan", "Ivanov", "123-11-22");

        person1.printPersonInfo();
        person2.printPersonInfo();

        person1.setFirstName("Dasha");
        person1.setLastName("Petrova");

        person1.printPersonInfo();
        person2.printPersonInfo();

    }
}
