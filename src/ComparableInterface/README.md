# Comparable Interface
- Sebelumnya kita sudah tahu bahwa operator perbandingan object menggunakan method equals.
- Bagaimana dengan operator perbandingan lainnya ? Seperti kurang dari atau lebih dari ?.
- Operator perbandingan tersebut bisa kita lakukan, jika object kita mewariskan interface generic Comparable.
- Ini banyak sekali digunakan seperti untuk proses pengurutan data misalnya.
- [Dokumentasi Comparable](https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/lang/Comparable.html).
- Kode: Comparable
```java
public class Person implements Comparable<Person> {
    private String name;
    private String address;
    
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
    
    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.name);
    }
}
```
- Kode: Menggunakan Comparable

```java
import java.util.Arrays;

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
```