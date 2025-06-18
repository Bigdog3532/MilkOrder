

public class NameAndNumbers {

    private int id;
    public int getId() {
        return id;
    }

    private String name;
    private Long PhoneNum;


    public NameAndNumbers(int id, String name, Long phoneNum) {
        this.id = id;
        this.name = name;
        this.PhoneNum = phoneNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPhoneNum() {
        return PhoneNum;
    }

    public void setPhoneNum(Long phoneNum) {
        PhoneNum = phoneNum;
    }
    

    

}