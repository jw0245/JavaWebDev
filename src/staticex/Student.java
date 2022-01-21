package staticex;

public class Student {

    public static int serialNum = 1000;
    private int studentID;
    public String studentName;
    public String addrss;

    public Student(String name){
        studentName = name;
        serialNum++;
        studentID = serialNum;
    }

    public Student(int id, String name){
        studentID = id;
        studentName = name;
        addrss = "주소 없음";
        serialNum++;
        studentID = serialNum;

    }

    public void showStudentInfo(){

        System.out.println(studentName + "," + addrss);
    }
    public int getStudentID(){
        serialNum++;
        return studentID;

    }
    public static int getSerialNum(){
        int i = 0 ;

        return serialNum;
    }
    public String getStudentName(){

        return studentName;
    }
}
