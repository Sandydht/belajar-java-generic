# Type Erasure
- Type erasure adalah proses pengecekan generic pada saat compile time, dan menghiraukan pengecekan pada saat runtime.
- Type erasure menjadikan informasi generic yang kita buat akan hilang ketika kode program kita telah di compile menjadi binary file.
- Compiler akan mengubah generic parameter type menjadi tipe Object di Java.
- Kode: Type Erasure
```java
public class Data<T> {
    private T data;
    
    public Data(T data) {
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
Akan di compile menjadi seperti dibawah ini
```java
public class Data {
    private Object data;
    
    public Data(Object data) {
        this.data = data;
    }
    
    public Object getData() {
        return data;
    }
    
    public void setData(Object data) {
        this.data = data;
    }
}
```

## Problem Type Erasure
- Karena informasi generic hilang ketika sudah menjadi binary file.
- Oleh karena itu, konversi tipe data generic akan berbahaya jika dilakukan secara tidak bijak.
- Kode: Problem Type Erasure
```java
public static class Data<T> {
    private T data;
    
    public Data(T data) {
        this.data = data;
    }
    
    public T getData() {
        return data;
    }
    
    public void setData(T data) {
        this.data = data;
    }
}

public static void main(String[] args) {
    Data stringData = new Data<>("Sandy");
    Data<Integer> integerData = (Data<Integer>) stringData;
    Integer integer = integerData.getData(); // error
    System.out.println(integer);
}
```