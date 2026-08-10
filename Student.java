
public class Student {
    //variables
    public String studentName;
    public String studentAge;
    public String studentDOB;
    private String studentMobileNo;


    //methods or functions
    
    //Default constructor or NoArgs constructor
    // public Student() {

    // }

    public Student(String studentName, String studentAge, String studentDOB, String studentMobileNo) {
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentDOB = studentDOB;
        this.studentMobileNo = studentMobileNo;
    }

    public String toString() {
        System.out.println("Name: " + studentName);
        System.out.println("Age: " + studentAge);
        System.out.println("Date of Birth: " + studentDOB);
        System.out.println("Mobile Number: " + studentMobileNo);
        return "";
    }
}
