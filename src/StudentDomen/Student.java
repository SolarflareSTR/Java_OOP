package StudentDomen;

public class Student extends User {
    private long studentID;
    public Student(String firstName, String secondName, int age, long studentID) {
        super(firstName, secondName, age);
        this.studentID = studentID;
    }

    public long getStudentID() {
      return studentID;
    }

    public void setStudentID(long studentID) {
      this.studentID = studentID;

    }
    @Override
    public String toString() {
        return "Student{" +
        "studentID=" + studentID
        +", firstName=" + super.getFirstName()
        +", secondName=" + super.getSecondName()
        +", age=" + super.getAge()+
        '}';
    }
    
    
}