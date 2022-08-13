public class Customer {
    private String name;
    private String age;
    private String gender;
    private String aadharNumber;
    private String phoneNumber;
    private String  baggageWeight;
    public Customer(String name, String age, String gender, String aadharNumber, String phoneNumber,
    String baggageWeight) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.aadharNumber = aadharNumber;
        this.phoneNumber = phoneNumber;
        this.baggageWeight = baggageWeight;
    }


    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getAadharNumber() {
        return aadharNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getBaggageWeight() {
        return baggageWeight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAadharNumber(String aadharNumber) {
        this.aadharNumber = aadharNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setBaggageWeight(String baggageWeight) {
        this.baggageWeight = baggageWeight;
    }
}