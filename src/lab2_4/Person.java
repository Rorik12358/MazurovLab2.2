package lab2_4;

/**
 * Created by R2-D2 on 16.02.2016.
 */
public class Person {
    String firstName, lastName, gender;
    int age, phoneNumber;
    Person a = new Person("Julia", "Miller", "female", 20, 8245918);
    String s = a.greeting();

    public String greeting(){
        String greeting = "Hello! My name is "+firstName;
        System.out.println(greeting);
        return greeting;
    }
    public void greeting(String greet){
        System.out.println(greet+". I am "+gender+". My name is "+firstName+" "+lastName+" I am a "+age+" ears old. My phone is "+phoneNumber);
    }
    public void greeting(int a){
        System.out.println("Hello!");
    }

    public Person(String firstName, String lastName, String gender, int age, int phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }
}
