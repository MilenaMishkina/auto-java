package practice_3;

public class University {
    static String universityName;
    final int studentID;
    String studentName;

    public University(int studentIDValue, String studentNameValue) {
        studentID = studentIDValue;
        studentName = studentNameValue;
    }

    public static void changeUniversityName(String newName) {
        universityName = newName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void printStudentInfo() {
        System.out.println("University: " + universityName + ". " + "StudentID: " + studentID + ". " + "Name: " + studentName);
    }

    public static void main(String[] args) {
        University student1 = new University(1234678, "Ivan");
        University student2 = new University(13333, "Petr");
        University student3 = new University(123535, "Alex");

        System.out.println(University.universityName);
        University.changeUniversityName("New name");

        student1.printStudentInfo();
        student2.printStudentInfo();
        student3.printStudentInfo();
    }
}
