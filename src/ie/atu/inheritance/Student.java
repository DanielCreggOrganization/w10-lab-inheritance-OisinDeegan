package ie.atu.inheritance;

public class Student extends Person{
    private String studentId;

    public Student(String studentId, String name, int age){
        super(age, name);
        this.studentId=studentId;
    }

    public void setStudentId(String input){
        studentId=input;
    }

    public String getStudentId(){
        return studentId;
    }
}
