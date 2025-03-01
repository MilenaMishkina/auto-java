package practice_2;

public class StudentGroup {
    String groupName;
    int studentCount;

    public StudentGroup(String groupNameValue, int studentCountValue) {
        groupName = groupNameValue;
        studentCount = studentCountValue;
    }

    public String getGroupName() {
        return groupName;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setGroupName(String newGroupName) {
        groupName = newGroupName;
    }

    public void setStudentCount(int newStudentCount) {
        studentCount = newStudentCount;
    }

    public void printInfo() {
        System.out.println("Группа: " + groupName + ", " + "Количество студентов: " + studentCount);
    }

    public static void main(String[] args) {
        StudentGroup newStudentGroup = new StudentGroup("QA", 10);
        newStudentGroup.printInfo();
        newStudentGroup.setStudentCount(15);
        newStudentGroup.printInfo();

    }
}
