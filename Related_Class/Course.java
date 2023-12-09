package Related_Class;

public class Course {
    //Data fields
    private String courseName;
    private String[] students = new String[5];
    private int numberOfStudents = 0;

    //Constructors
    public Course(String courseName) {
        this.courseName = courseName;
    }

    //Methods
    public String getCourseName() {
        return courseName;
    }
    public void addStudent(String student) {
        if (numberOfStudents >= students.length) {
            String[] temp = new String[students.length + 1];
            System.arraycopy(students, 0, temp, 0, students.length);
            students = temp;
        }
        students[numberOfStudents++] = student;
    }
    public void dropStudent(String student) {
            for (int i = 0; i < students.length; i++) {
                if (student == students[i]) {
                    numberOfStudents--;
                    for (int j = i; j < numberOfStudents; j++) {
                        students[j] = students[j+1];
                    }
                }
            }
    }
    public String[] getStudents() {
        return students;
    }
    public int getNumberOfStudents() {
        return numberOfStudents;
    }
    public void clear() {
        numberOfStudents = 0;
        students = new String[5];
    }
}
