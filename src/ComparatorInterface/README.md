# Comparator Interface
- Jika kita ingin mengurutkan class yang kita gunakan, cukup mudah tinggal implement interface Comparable.
- Namun bagaimana jika class tersebut milik orang lain ? Tidak bisa kita ubah ?.
- Maka kita bisa menggunakan interface generic yang bernama Comparator.
- [Dokumentasi Comparator](https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Comparator.html).
- Kode: Menggunakan Comparator

```java
import core.Person;

import java.util.Arrays;
import java.util.Comparator;

public static void main(String[] args) {
    Person[] people = {
            new Person("Sandy", "Indonesia"),
            new Person("Dwi", "Indonesia"),
            new Person("Handoko", "Indonesia"),
            new Person("Trapsilo", "Indonesia"),
    };
    
    Comparator<Person> comparator = new Comparator() {
        @Override
        public int compare(Person o1, Person o2) {
            return o1.getAddress().compareTo(o2.getAddress());
        }
    };

    Arrays.sort(people, comparator);
    System.out.println(Arrays.toString(people));
}
```