package java101.Java37_ogrenci_not_sistemi;

//  Course Sınıfı Özellikleri :
//  Nitelikler : name,code,prefix,note,Teacher
//  Metotlar : Course() , addTeacher() , printTeacher()
public class Course {

    private Teacher teacher;
    private String name;
    private String code;
    private String prefix;
    private int note = 0;
    private int oralExam = 0;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
    }

    public Course(Course course) {
        this.name = course.getName();
        this.code = course.getCode();
        this.prefix = course.getPrefix();
    }

    public void addTeacher(Teacher teacher) {
        if (prefix.equals(teacher.getBranch())) {
            this.teacher = teacher;
            System.out.println("Transaction successful.");
        } else System.out.println(teacher.getName() + "  can't give this lesson.");
    }

    public void printTeacher() {
        System.out.println("The teacher's name:\t" + teacher.getName());
        System.out.println("The teacher's branch:\t" + teacher.getBranch());
        System.out.println("The teacher's phone:\t" + teacher.getPhone());
    }

    public Teacher getTeacher() {
        return teacher;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public int getOralExam() {
        return oralExam;
    }

    public void setOralExam(int oralExam) {
        this.oralExam = oralExam;
    }
}
