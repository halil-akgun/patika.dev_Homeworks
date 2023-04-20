package java101;
/*
Öğrenci Not Sistemi
Course Sınıfı Özellikleri :
Nitelikler : name,code,prefix,note,Teacher
Metotlar : Course() , addTeacher() , printTeacher()

Teacher Sınıfı Özellikleri :
Nitelikler : name,mpno,branch
Metotlar : Teacher()

Student Sınıfı Özellikleri :
Nitelikler : name,stuNo,classes,course1,course2,course3,avarage,isPass
Metotlar : Student(), addBulkExamNote(), isPass(), calcAvarage(), printNote()

Ödev
Course sınıfına derse ait sözlü notu kısmını girin ve ortalamaya etkisini her ders için ayrı ayrı belirtin.
Sözlü notların ıda ortalamaya etkileme yüzdesi ile dahil edin.

Örnek : Fizik dersine ait sözlü notunun ortalamaya etkisi %20 ise sınav notunun etkisi %80'dir.
Öğrenci sözlüden 90, sınavdan 60 almış ise, o dersin genel ortalamaya etkisi şu şekilde hesaplanır :
Fizik Ortalaması : (90 * 0.20) + (60* 0.80);
 */

import java101.java37_ogrenci_not_sistemi.Course;
import java101.java37_ogrenci_not_sistemi.Student;
import java101.java37_ogrenci_not_sistemi.Teacher;

public class Java37_OgrenciNotSistemi {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("Ali", "123", "MAT");
        Teacher teacher2 = new Teacher("Veli", "123", "HIS");
        Teacher teacher3 = new Teacher("Can", "123", "TUR");

        Course math = new Course("Math", "101", "MAT");
        Course history = new Course("History", "102", "HIS");
        Course turkish = new Course("Turkish", "103", "TUR");

        math.addTeacher(teacher1);
        history.addTeacher(teacher2);
        turkish.addTeacher(teacher3);

        Student GUL = new Student(1, "GUL", new Course(math), new Course(history), new Course(turkish));

        GUL.addBulkExamNote(100, 100, 100);
        GUL.addBulkOralExamNote(100, 100, 100);
        GUL.printNote();

        Student hll = new Student(2, "hll", new Course(math), new Course(history), new Course(turkish));
        hll.addBulkExamNote(99, 99, 99);
        hll.addBulkOralExamNote(99, 99, 100);
        hll.printNote();

        GUL.printNote(); // i fixed with Course(Course course) constructor
    }
}
