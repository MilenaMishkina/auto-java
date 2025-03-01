package practice_2;

public class Teacher {
    String name;
    String subject;

    public Teacher(String nameValue, String subjectValue) {
        name = nameValue;
        subject = subjectValue;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setSubject(String newSubject) {
        subject = newSubject;
    }

    public void printInfo() {
        System.out.println("Teacher: " + name + ", " + "Subject: " + subject);
    }

    public static void main(String[] args) {
        Teacher newTeacher = new Teacher("Иван Иванов", "Русский");
         newTeacher.printInfo();
         newTeacher.setSubject("Математика");
         newTeacher.printInfo();
    }
}
