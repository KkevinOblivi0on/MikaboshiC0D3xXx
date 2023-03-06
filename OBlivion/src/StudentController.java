public class StudentController {
    public static void main(String[] args) {
        Student student = new Student("Lisa Palombo", 123456789, "Active");
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student ID: " + student.getID());
        System.out.println("Student Status: " + student.getStatus());
    }
}
