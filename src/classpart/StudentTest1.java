package classpart;

public class StudentTest1 {
    public static void main(String[] args) {

        Student1 studentLee = new Student1(100, "Lee");
        studentLee.setKoreaSubject("국어", 100);
        studentLee.setMatchSubject("수학",95);

        Student1 studentKim = new Student1(101, "Kim");
        studentKim.setKoreaSubject("국어",80);
        studentKim.setMatchSubject("수학", 99);

        studentLee.showStudentScore();
        studentKim.showStudentScore();

    }
}
