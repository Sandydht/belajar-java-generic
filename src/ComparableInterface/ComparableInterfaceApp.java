package ComparableInterface;

import core.Person;

import java.util.Arrays;

public class ComparableInterfaceApp {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Sandy", "Indonesia"),
                new Person("Dwi", "Indonesia"),
                new Person("Handoko", "Indonesia"),
                new Person("Trapsilo", "Indonesia"),
        };

        Arrays.sort(people);
        System.out.println(Arrays.toString(people));
    }
}
