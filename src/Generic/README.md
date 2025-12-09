# Generic Class
- Generic class adalah class atau interface yang memiliki parameter type.
- Tidak ada ketentuan dalam pembuatan generic parameter type, namun biasanya kebanyakn orang menggunakan 1 karakter sebagai generic parameter type.
- Nama generic parameter type yang biasa digunakan adalah:
  - E - Element (biasa digunakan di collection atau struktur data).
  - K - Key
  - N - Number
  - T - Type
  - V - Value
  - S, U, V, etc. - 2nd, 3rd, 4th types
- Kode: Generic Class
```java
public class MyData<T> {
    private T data;
    
    public MyData(T data) {
        this.data = data;
    }
    
    public T getData() {
        return data;
    }
    
    public void setData(T data) {
        this.data = data;
    }
}
```
- Kode: Membuat Generic Object
```java
public static void main(String[] args) {
    MyData<String> myDataString = new MyData<String>("Sandy");
    MyData<Integer> myDataInteger = new MyData<Integer>(1);
    var myDataBoolean = new MyData<Boolean>(true);

    System.out.println(myDataString.getData());
    System.out.println(myDataInteger.getData());
    System.out.println(myDataBoolean.getData());
}
```

## Multiple Parameter Type
- Parameter type di Generic Class boleh lebih dari satu.
- Namun harus menggunakan nama type berbeda.
- Ini sangat berguna ketika kita ingin membuat generic parameter type yang banyak.
- Kode: Multiple Parameter Type
```java
public class Pair<T, U> {
    private T first;
    private U second;
    
    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }
    
    public T getFirst() {
        return first;
    }
    
    public void setFirst(T first) {
        this.first = first;
    }
    
    public U getSecond() {
        return second;
    }
    
    public void setSecond(U second) {
        this.second = second;
    }
}
```

# Generic Method
- Generic parameter type tidak hanya bisa digunakan pada class atau interface.
- Kita juga bisa menggunakan generic parameter type di method.
- Generic parameter type yang kita deklarasikan di method, hanya bisa diakses di method tersebut, tidak bisa digunakan di luar method.
- Ini cocok jika kita ingin membuat generic method, tanpa harus mengubah deklarasi class.
- Kode: Generic Method
```java
public class ArrayHelper {  
    public static <T> int count(T[] array) {
        return array.length;
    }
}
```
- Kode: Menggunakan Generic Method

```java
import util.ArrayHelper;

public static void main(String[] args) {
  String[] names = {"Sandy", "Dwi", "Handoko", "Trapsilo"};
  Integer[] values = {1, 2, 3, 4, 5};

  System.out.println(ArrayHelper.<String>count(names));
  System.out.println(ArrayHelper.<Integer>count(values));
}
```