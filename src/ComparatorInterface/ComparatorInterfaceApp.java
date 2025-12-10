package ComparatorInterface;

import core.Person;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorInterfaceApp {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Sandy", "Indonesia"),
                new Person("Dwi", "Indonesia"),
                new Person("Handoko", "Indonesia"),
                new Person("Trapsilo", "Indonesia"),
        };

        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAddress().compareTo(o2.getAddress());
            }
        };

        Arrays.sort(people, comparator);
        System.out.println(Arrays.toString(people));
    }
}
