package java101.java37_ogrenci_not_sistemi;

//  Student Sınıfı Özellikleri :
//  Nitelikler : name,stuNo,classes,course1,course2,course3,average,isPass
//  Metotlar : Student(), addBulkExamNote(), isPass(), calcAverage(), printNote()
public class Student {

    private Course math;
    private Course history;
    private Course turkish;

    private int studentNo;

    private String name;

    private double average = 0;

    private boolean isPass;

    public Student(int studentNo, String name, Course math, Course history, Course turkish) {
        this.studentNo = studentNo;
        this.name = name;
        this.math = math;
        this.history = history;
        this.turkish = turkish;
    }

    public void addBulkExamNote(int math, int history, int turkish) {
        if (math >= 0 && math <= 100) this.math.setNote(math);
        if (history >= 0 && history <= 100) this.history.setNote(history);
        if (turkish >= 0 && turkish <= 100) this.turkish.setNote(turkish);
        calcAverage();
    }

    public void addBulkOralExamNote(int math, int history, int turkish) {
        if (math >= 0 && math <= 100) this.math.setOralExam(math);
        if (history >= 0 && history <= 100) this.history.setOralExam(history);
        if (turkish >= 0 && turkish <= 100) this.turkish.setOralExam(turkish);
        calcAverage();
    }

    public void isPass() {
        isPass = average >= 55;
    }

    private void calcAverage() {
        average = ((math.getNote() * 0.80) + (history.getNote() * 0.80) + (turkish.getNote() * 0.80)) / 3;
        average += ((math.getOralExam() * 0.20) + (history.getOralExam() * 0.20) + (turkish.getOralExam() * 0.20)) / 3;
    }

    public void printNote() {
        System.out.println("Math\texam:\t" + math.getNote() + "\t - Oral exam:\t" + math.getOralExam());
        System.out.println("History\texam:\t" + history.getNote() + "\t - Oral exam:\t" + history.getOralExam());
        System.out.println("Turkish\texam:\t" + turkish.getNote() + "\t - Oral exam:\t" + turkish.getOralExam());
        System.out.println("Average (Exam*0.80 + OralExam*0.20): " + average);
        System.out.println();
    }
}
