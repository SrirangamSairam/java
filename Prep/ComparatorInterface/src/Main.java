import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("sai",23));
        persons.add(new Person("ram",32));
        persons.add(new Person("abc",27));
        persons.add(new Person("xyz",25));
        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o2.getAge() - o1.getAge();
            }
        };
        Comparator<Person> comparator1 = (o1,o2) -> (o2.getAge()- o1.getAge());
//        persons.sort(comparator);
        Collections.sort(persons,comparator1);
        for(Person person: persons) {
            System.out.println(person.getName());
        }
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}