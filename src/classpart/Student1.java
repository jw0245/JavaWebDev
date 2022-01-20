package classpart;

public class Student1 {
    int StudentID;
    String studentName;

    Subject korea;
    Subject match;

    public Student1(int id, String name) {
        StudentID = id;
        studentName = name;

        korea = new Subject();
        match = new Subject();
    }


    public void setKoreaSubject(String name, int score){

        korea.subjectName = name;
        korea.score = score;
    }
    public  void setMatchSubject(String name, int score){

        match.subjectName = name;
        match.score = score;
    }

    public void showStudentScore(){
        int total = korea.score + match.score;
        System.out.println(studentName + "학생의 총점은" + total + "점 입니다.");
    }
}
