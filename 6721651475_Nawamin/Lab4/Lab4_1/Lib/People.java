package Lib;

public class People {
    private String firstname;
    private String lastname;
    protected MyDate birthdate = new MyDate();

    public String getFirstName() {
        return firstname;
    }
    public String getLastName() {
        return lastname;
    }
    public String Name() {
        return firstname + " " + lastname;
    }
    public MyDate getBirthdate() {
        return birthdate;
    }

    public void setFirstName(String first) {
        firstname = first;
    }
    public void setLastName(String last) {
        lastname = last;
    }
    public void setName(String first, String last) {
        setFirstName(first);
        setLastName(last);
    }
    public void setBirthdate(int d, int m, int y) {
        birthdate.setDate(d, m, y);
    }
    @Override
    public String toString() {
        return "My name is " + Name() + ".\n" + 
        "I was born on " + birthdate.toString() + ".";
    }
}
