package Person;

public class Person {
    public String fullName;
    public int Age;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        Age = age;
    }

    public Person() {
    }

    void move(){System.out.print(fullName +" ");}
    void talk(){System.out.println("Person говорит" + Age +" лет");}


    public static void main(String[] args) {
        Person Person1 = new Person("Иван",44);
        Person Person2 = new Person();

        Person1.move();
        Person1.talk();
        Person2.move();
        Person2.talk();
    }
}
