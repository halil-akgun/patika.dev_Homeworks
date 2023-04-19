package java101.java37_ogrenci_not_sistemi;

//  Teacher Sınıfı Özellikleri :
//  Nitelikler : name,mpno,branch
//  Metotlar : Teacher()
public class Teacher {

    private String name;
    private String phone;
    private String branch;

    public Teacher(String name, String phone, String branch) {
        this.name = name;
        this.phone = phone;
        this.branch = branch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
