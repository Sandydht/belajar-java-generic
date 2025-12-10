# Wildcard
- Kadang ada kasus kita tidak peduli dengan generic parameter type pada object.
- Misal kita hanya ingin print data T, tidak peduli tipe apapun.
- Jika kita mengalami kasus seperti ini, kita bisa menggunakan wildcard.
- Wildcard bisa dibuat dengan mengganti generic parameter type dengan karakter ?.
- Kode: Wildcard
```java
public static void main(String[] args) {
    print(new MyData<>(100));
    print(new MyData<>("Sandy"));
    print(new MyData<>(true));
}

public static void print(MyData<?> data) {
    System.out.println(data.getData());
}
```