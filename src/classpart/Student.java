package classpart;

public class Student {
    int studentID;

    private int studenntID;
    public  String studentName;
    public String address;

    public Student(String name){
        studentName = name;

    }
    // 생성자
    public Student(int id, String name){
        studenntID = id;
        studentName = name;
        address = "주소 없음";

    }

    public void showStudentInfo(){

        System.out.println(studentName + "," + address );
    }

    public String getStudentName(){

        return studentName;
    }

    public static void main(String[] args) {
        Student studentPark = new Student("박은종");
        studentPark.studentName = "박은종";
        studentPark.showStudentInfo();
    }

}
