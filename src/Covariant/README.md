# Covariant
- Covariant artinya kita bisa melakukan subtitusi subtype (child) dengan supertype (parent).
- Caranya agar generic object kita menjadi covariant adalah dengan menggunakan kata kunci (? extends ParentClass).
- Artinya saat kita membuat object Contoh<String>, maka bisa disubtitusi menjadi Contoh<? extends Object>.
- Covariant adalah read-only, jadi kita tidak bisa mengubah data generic-nya.
- Kode: Covariant
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

public static void main(String[] args) {
    MyData<String> stringMyData = new MyData<>("Sandy");
    process(stringMyData);
}

public static void process(MyData<? extends Object> data) {
    Object object = data.getData();
    data.setData("Sandy"); // error
}
```