package org.example.Employee;

public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private int age;

    public Employee(String name, String position, String email, String phone, int age) {
        this.fullName = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.age = age;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age > 0){
            this.age = age;
        }
    }
    @Override
    public String toString(){
        return "Employee: " + fullName +
                ", position: " + position +
                ", email: " + email +
                ", phone: " + phone +
                ", age: " + age;
    }
}

