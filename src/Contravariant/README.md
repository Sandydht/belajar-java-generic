# Contravariant
- Contravariant artinya kita bisa melakukan subtitusi supertype (parent) dengan subtype (child).
- Caranya agar generic object kita menjadi contravariant adalah dengan menggunakan kata kunci (? super SubClass).
- Artinya saat kita membuat object Contoh<Object>, maka bisa disubtitusi menjadi Contoh<? super String>.
- Contravariant bisa write dan read, namun perlu berhati - hati ketika melakukan read, terutama jika sampai parent-nya punya banyak child.
- Kode: Contravariant
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
    MyData<Object> objectMyData = new MyData<>("Sandy");
    MyData<? super String> stringMyData = objectMyData;
    process(objectMyData);

    System.out.println(objectMyData.getData());
    System.out.println(stringMyData.getData());
}

public static void process(MyData<? super String> myData) {
    myData.setData("Sandy");
    System.out.println(myData.getData());
}
```