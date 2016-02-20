package lab2_2;

/**
 * Created by R2-D2 on 16.02.2016.
 */
public class Employee {
    public void calcSalary(String name, double salary){
        System.out.println(name+"'s salary is "+salary);
    }
    public int summ(int... arr){
        int res = 0;
        for (int el: arr){
            res+=el;
        }
        return res;
    }
    public int summ(int a){
        return a;
    }
    public int summ(int a, int b){
        return a-b;
    }
}
