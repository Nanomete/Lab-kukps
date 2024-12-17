package Lib;

public class Employee extends People {
    private String company;
    private double salary;

    public String getCompany() {
        return company;
    }
    public double getSalary() {
        return salary;
    }

    public void setCompany(String c) {
        company = c;
    }
    public void setSalary(double s) {
        salary = s;
    }
    public boolean Taxpay() {
        double Money = salary * 12;
        if (Money > 200000) {
            return true;
        } else {
            return false;
        }
    }

    public void show() {
        System.out.println("I'm " + Name());
        System.out.println("I work for " + getCompany());
    }
}
