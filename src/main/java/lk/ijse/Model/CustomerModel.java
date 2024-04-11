package lk.ijse.Model;

public class CustomerModel {

    private String C_ID;
    private String First_Name;
    private String Last_Name;
    private String Address;
    private  int Phone_Number;
    private String Email;

    public CustomerModel(String c_ID, String first_Name, String last_Name, String address, int phone_Number, String email) {
        C_ID = c_ID;
        First_Name = first_Name;
        Last_Name = last_Name;
        Address = address;
        Phone_Number = phone_Number;
        Email = email;
    }

    public CustomerModel() {
    }

    public String getC_ID() {
        return C_ID;
    }

    public void setC_ID(String c_ID) {
        C_ID = c_ID;
    }

    public String getFirst_Name() {
        return First_Name;
    }

    public void setFirst_Name(String first_Name) {
        First_Name = first_Name;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public void setLast_Name(String last_Name) {
        Last_Name = last_Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getPhone_Number() {
        return Phone_Number;
    }

    public void setPhone_Number(int phone_Number) {
        Phone_Number = phone_Number;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return "CustomerModel{" +
                "C_ID='" + C_ID + '\'' +
                ", First_Name='" + First_Name + '\'' +
                ", Last_Name='" + Last_Name + '\'' +
                ", Address='" + Address + '\'' +
                ", Phone_Number=" + Phone_Number +
                ", Email='" + Email + '\'' +
                '}';
    }
}
