package Lab7;

import Related_Class.Person;
import Related_Class.Student;
import Related_Class.Employee;
import Related_Class.Faculty;
import Related_Class.Staff;
import java.util.Scanner;

public class Pro73_64010765 {
    public static void main(String[] args) {
        // Creating objects
        Scanner input = new Scanner(System.in);
        Student student = new Student("Somsak", "FRESHMAN");

        // Input phrase
        System.out.println(student.getClass().getSimpleName());
        System.out.println("Name: " + student.getName());

        System.out.print("Address: ");
        String address = input.nextLine();
        student.setAddress(address);

        System.out.print("Phone: ");
        String phone = input.nextLine();
        student.setPhoneNumber(phone);

        System.out.print("Email: ");
        String email = input.nextLine();
        student.setEmail(email);

        System.out.print(student.toString());
        input.close();
    }
}
