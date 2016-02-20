package lab2_4;

/**
 * Created by R2-D2 on 16.02.2016.
 */
public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Bob", "Smith", "male", 27, 8245918);
        person1.greeting();
        person1.greeting("Hey");
        person1.greeting(9);
    }
}
