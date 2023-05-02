import java.sql.Date;

public class Student extends Person {
    private String studentID;
    private String major;
    private String degree;
    private int expectedGraduationYear;
    private double GPA;

    public Student(String firstName, String middleName, String lastName, Date dateOfBirth, String studentID,
                   String major, String degree, int expectedGraduationYear){
        super(firstName, middleName, lastName, dateOfBirth);
        this.studentID = studentID;
        this.major = major;
        this.degree = degree;
        this.expectedGraduationYear = expectedGraduationYear;
    }

    public String getStudentID(){
        return studentID;
    }

    public String getMajor(){
        return major;
    }

    public String getDegree(){
        return degree;
    }

    public int getExpectedGraduationYear(){
        return expectedGraduationYear;
    }

    public double getGPA(){
        return GPA;
    }

    private double calculateGPA(String[] grades){
        double totalPoints = 0.0;
        double totalCredits = 0.0;

        for(String grade : grades){
            switch (grade) {
                case "A":
                    totalPoints += 4.0;
                    totalCredits += 1.0;
                    break;
                case "A-":
                    totalPoints += 3.67;
                    totalCredits += 1.0;
                    break;
                case "B+":
                    totalPoints += 3.33;
                    totalCredits += 1.0;
                    break;
                case "B":
                    totalPoints += 3.0;
                    totalCredits += 1.0;
                    break;
                case "B-":
                    totalPoints += 2.67;
                    totalCredits += 1.0;
                    break;
                case "C+":
                    totalPoints += 2.33;
                    totalCredits += 1.0;
                    break;
                case "C":
                    totalPoints += 2.0;
                    totalCredits += 1.0;
                    break;
                case "D":
                    totalPoints += 1.0;
                    totalCredits += 1.0;
                    break;
                case "F":
                    totalCredits += 1.0;
                    break;
            }
        }

        if(totalCredits > 0){
            GPA = totalPoints / totalCredits;
        } else {
            GPA = 0.0;
        }

        return GPA;
    }

    public void setMajor(String major){
        this.major = major;
    }

    public void updateGPA(String[] grades){
        calculateGPA(grades);
    }
}