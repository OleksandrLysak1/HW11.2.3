package Exercise1_2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Locale;

class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person.Person { id= " + id + ", name = " + name.toUpperCase(Locale.ROOT) + "}";
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList<Person> peopleList = new LinkedList<>();
        peopleList.add(new Person(1, "Ivan"));
        peopleList.add(new Person(2, "Iryna"));
        peopleList.add(new Person(3, "Peter"));
        peopleList.add(new Person(4, "Viktor"));

        Collections.reverse(peopleList);

        String result = getOddIdPersons(peopleList);
        System.out.println(result);
    }

    public static String getOddIdPersons(LinkedList<Person> peopleList) {
        StringBuilder result = new StringBuilder();

        for (Person person : peopleList) {
            if (person.getId() % 2 != 0) {
                result.append(person.toString()).append("\n");
            }
        }

        return result.toString();
    }
}
