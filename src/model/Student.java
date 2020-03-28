package model;

public class Student {
    
    private String Id;  
    private String name;    
    private String password;
    private String depart;
    private String sex;
	private String phone;
    public String getId() {
        return Id;
    }
    public void setId(String id) {
        Id = id;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getDepart() {
        return depart;
    }
    public void setDepart(String depart) {
        this.depart = depart;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    //构造方法
    public Student() {
        super();
    }
    public Student(String id, String password) {
        super();
        Id = id;
        this.password = password;
    }
    public Student(String id, String name, String password, String sex, String depart, String phone) {
        super();
        Id = id;
        this.name = name;
        this.password = password;
        this.sex = sex;
        this.depart = depart;
        this.phone = phone;
    }
  


    
}
