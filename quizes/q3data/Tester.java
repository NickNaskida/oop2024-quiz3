package quizes.q3data;

import java.util.List;

public class Tester {
    public static void main(String[] args) {
        List<Person> persons = PersonManager.getPersons();

        for(Person p: persons) {
            System.out.println(p.getName());
        }
    }
}
