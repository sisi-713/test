package model;

public class Record {
	
	private String Id;
	
	private String name;
	private String sex;
	private String phone;
	private String depart;
	private String address;
	private String nati;
	private String touch;
	private String suspected;
    private String infected;
    private String date;
    private String remark;
	public String getSuspected() {
        return suspected;
    }
    public void setSuspected(String suspected) {
        this.suspected = suspected;
    }

	
    public String getRemark() {
        return remark;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
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
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getDepart() {
        return depart;
    }
    public void setDepart(String depart) {
        this.depart = depart;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getNati() {
        return nati;
    }
    public void setNati(String nati) {
        this.nati = nati;
    }
    public String getTouch() {
        return touch;
    }
    public void setTouch(String touch) {
        this.touch = touch;
    }
    public String getInfected() {
        return infected;
    }
    public void setInfected(String infected) {
        this.infected = infected;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public Record() {
        super();
    }
    public Record(String id) {
        super();
        Id = id;
    }


    public Record(String id, String name, String sex, String depart, String phone, String nati,
            String touch, String infected,String suspected, String date,String address,String remark) {
        super();
        Id = id;
        this.name = name;
        this.sex = sex;
        this.phone = phone;
        this.depart = depart;
        this.address = address;
        this.nati = nati;
        this.touch = touch;
        this.suspected = suspected;
        this.infected = infected;
        this.date = date;
        this.remark = remark;
    }
    public Record(String id, String date) {
        super();
        Id = id;
        this.date = date;
    }
    public Record(String id, String name, String date) {
        super();
        Id = id;
        this.name = name;
        this.date = date;
    }
    

    public Record(String id2, String name2, String sex2, String depart2, String phone2, String address2, String nati2,
            String touch2, String infected2, String date2) {
        // TODO Auto-generated constructor stub
    }
    
	
	
}
