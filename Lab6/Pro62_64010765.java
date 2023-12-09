package Lab6;

import Related_Class.Course;

public class Pro62_64010765 {
    public static void main(String[] args) {
        // Creating an object
        Course newCourse = new Course("TestingCourse");

        // Adding 3 students
        newCourse.addStudent("A");
        newCourse.addStudent("B");
        newCourse.addStudent("C");

        // Remove second student
        newCourse.dropStudent("B");

        // newCourse.clear();
        String[] students = newCourse.getStudents();

        // Print output
        System.out.println("Course name: " + newCourse.getCourseName());
        System.out.println("Number of students in the course: " + newCourse.getNumberOfStudents());
        System.out.print("Name of students in the course: ");
        for (int i = 0; i < newCourse.getNumberOfStudents(); i++) {
            if (i == 0) {
                System.out.print(students[i]);
            } else {
                System.out.print(", " + students[i]);
            }
        }
    }
}
