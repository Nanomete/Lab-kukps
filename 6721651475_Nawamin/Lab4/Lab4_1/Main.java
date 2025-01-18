import Lib.Employee;
import Lib.MyDate;
import Lib.People;

public class Main {
    public static void main(String[] args) {
        Employee J = new Employee();
        Employee K = new Employee();

        J.setName("Leonel", "Messi");
        J.setBirthdate(24, 6, 1987);
        J.setCompany("Argentina FC");
        J.setSalary(15000);

        K.setName("Cristaino", "Ronaldo");
        K.setBirthdate(5, 2, 1985);
        K.setCompany("Portugal FC");
        K.setSalary(19000);

        if (J.Taxpay()) J.show();
        if (K.Taxpay()) K.show();

        People A = new People();
        A.setName("David", "Beckham");
        A.setBirthdate(2, 5, 1975);
        System.out.println(A.toString());
 
        // no.1
        MyDate x = new MyDate();
        x.setDate(16, 8, 2005);
        System.out.println(x.toString());
        x.setMonth(20);
    }    
}
