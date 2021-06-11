package chat;



import java.io.Serializable;
public class Inputs implements Serializable{

    String FirstName;
    String LastName;
    String UserName;
    String Password;
    String Email;
    String PhoneNo;
    String CNIC;
    String city;
    public Inputs(){}
    public Inputs(String FirstName, String LastName, String UserName, String Password, String Email, String PhoneNo, String CNIC) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.UserName = UserName;
        this.Password = Password;
        this.Email = Email;
        this.PhoneNo = PhoneNo;
        this.CNIC = CNIC;
        
    }
    public String getFirstName() {
        return this.FirstName;
    }

    public void setFirstName(String FirstName){
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return this.LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getUserName() {
        return this.UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPassword() {
        return this.Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getEmail() {
        return this.Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPhoneNo() {
        return this.PhoneNo;
    }

    public void setPhoneNo(String PhoneNo) {
        this.PhoneNo = PhoneNo;
    }

    public String getCNIC() {
        return this.CNIC;
    }

    public void setCNIC(String CNIC) {
        this.CNIC = CNIC;
    }

    @Override
    public String toString() {
        return 
            " FirstName= " + getFirstName() + "\n" +
            " LastName= " + getLastName() + "\n" +
            " UserName= " + getUserName() + "\n" +
            " Password= " + getPassword() + "\n" +
            " Email= " + getEmail() + "\n" +
            " PhoneNo= " + getPhoneNo() + "\n" +
            " CNIC= " + getCNIC();
    }
}



