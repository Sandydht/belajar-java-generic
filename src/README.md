# Pengenalan Generic
- Generic adalah kemampuan menambahkan parameter type saat membuat class atau method.
- Berbeda dengan tipe data yang biasa kita gunakan di class atau di function, generic memungkinkan kita bisa mengubah - ubah bentuk tipe data sesuai yang kita mau.

## Manfaat Generic
- Pengecekan ketika proses kompilasi
- Tidak perlu manual menggunakan pengecekan tipe data dan konversi tipe data.
- Memudahkan programmer membuat kode program yang generic sehingga bisa digunakan oleh berbagai tipe data.

- Kode: Bukan Generic
```java
public static class Data {
    private Object data;
    
    public Object getData() {
        return data;
    }
    
    public static void setData(String data) {
        this.data = data;
    }
}

public class Main {
    public static void main(String[] args) {
        Data dataString = new Data();
        dataString.setData("Sandy");
        String value = (String) dataString.getData();
        System.out.println(value);
    }
}
```
- Kode: Generic
```java
public static class Data<T> {
    private T data;
    
    public T getData() {
        return data;
    }
    
    public static void setData(String data) {
        this.data = data;
    }
}

public class Main {
    public static void main(String[] args) {
        Data<String> dataString = new Data<String>();
        dataString.setData("Sandy");
        String value = dataString.getData();
        System.out.println(value);
    }
}
```
