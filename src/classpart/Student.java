package classpart;

public class Student {
    int studentID;
    String studentName;
    String address;

    public void showStudentInfo(){

        System.out.println(studentName + "," + address );
    }

    public String getStudentName(){

        return studentName;
    }

    public static void main(String[] args) {
        Student studentPark = new Student();
        studentPark.studentName = "박은종";
        studentPark.showStudentInfo();
    }

}
