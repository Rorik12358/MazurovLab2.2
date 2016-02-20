package lab2_2;

/**
 * Created by R2-D2 on 16.02.2016.
 */
public class Accountant {
    static int a = 10;
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.calcSalary("Bob", 2500);
        employee.calcSalary("Rob", 1500);
        employee.calcSalary("Joi", 5000);
        int summ = employee.summ(2,1);
        System.out.println(summ);
    }
}
